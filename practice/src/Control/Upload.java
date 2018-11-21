package Control;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import Sercive.Filesservice;


@WebServlet("/Upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				Filesservice fil= new Filesservice();
				String fname=null;
				String  fmaoshu=null;
		//创建一个请求解析工厂	
		FileItemFactory factory=new DiskFileItemFactory();
		//根据解析工厂创建一个文件上传对象
		ServletFileUpload up=new ServletFileUpload(factory);
		//设置上传文件的总大小8M
		up.setSizeMax(999999);
		try {
			//上传对象去解析请求，将请求中的所有表单元素全部打包成一个集合，文件和非文件都会打包进来
			List<FileItem> files=up.parseRequest(request);
			//获取项目中文件夹的绝对路径,用来存放上传的文件
			String re=getServletContext().getRealPath("upload");
			if(files!=null){
				for (FileItem fi : files) {
					if(fi.isFormField()){//判断该参数是不是一个普通的表单元素
											//解决中文乱码问（）题
								System.out.println("name="+fi.getFieldName()+","
								+ "value="+new String(fi.getString().getBytes("iso-8859-1"),"utf-8"));
							
							 
							
							 fmaoshu=new String(fi.getString().getBytes("iso-8859-1"),"utf-8");
							
					}else{	//是一个文件
							//构造客户端完整路径的文件对象，目的是为了获取该文件的文件名
							File fullFile=new File(fi.getName());
								fname=fi.getName();
								System.out.println(fi.getName());
								System.out.println(fullFile.getName());
							//根据服务器的路径和文件名构造要保存到服务器的文件对象
							File savedFile = new File(re, fullFile.getName());
						   //将文件写入
				            fi.write(savedFile);
						
					}
				}
				fil.add(fname, fmaoshu);	
				
				
				
				
			}
			
		} catch (FileUploadException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("mess", "<script>alert('上传成功！')</script>");
		request.getRequestDispatcher("jsp/UpLoad.jsp").forward(request, response);
	}

}
