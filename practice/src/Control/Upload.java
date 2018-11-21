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
		//����һ�������������	
		FileItemFactory factory=new DiskFileItemFactory();
		//���ݽ�����������һ���ļ��ϴ�����
		ServletFileUpload up=new ServletFileUpload(factory);
		//�����ϴ��ļ����ܴ�С8M
		up.setSizeMax(999999);
		try {
			//�ϴ�����ȥ�������󣬽������е����б�Ԫ��ȫ�������һ�����ϣ��ļ��ͷ��ļ�����������
			List<FileItem> files=up.parseRequest(request);
			//��ȡ��Ŀ���ļ��еľ���·��,��������ϴ����ļ�
			String re=getServletContext().getRealPath("upload");
			if(files!=null){
				for (FileItem fi : files) {
					if(fi.isFormField()){//�жϸò����ǲ���һ����ͨ�ı�Ԫ��
											//������������ʣ�����
								System.out.println("name="+fi.getFieldName()+","
								+ "value="+new String(fi.getString().getBytes("iso-8859-1"),"utf-8"));
							
							 
							
							 fmaoshu=new String(fi.getString().getBytes("iso-8859-1"),"utf-8");
							
					}else{	//��һ���ļ�
							//����ͻ�������·�����ļ�����Ŀ����Ϊ�˻�ȡ���ļ����ļ���
							File fullFile=new File(fi.getName());
								fname=fi.getName();
								System.out.println(fi.getName());
								System.out.println(fullFile.getName());
							//���ݷ�������·�����ļ�������Ҫ���浽���������ļ�����
							File savedFile = new File(re, fullFile.getName());
						   //���ļ�д��
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
		
		request.setAttribute("mess", "<script>alert('�ϴ��ɹ���')</script>");
		request.getRequestDispatcher("jsp/UpLoad.jsp").forward(request, response);
	}

}
