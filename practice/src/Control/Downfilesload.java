package Control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Files;
import Sercive.Filesservice;

@WebServlet("/Downfilesload")
public class Downfilesload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				Filesservice fi=new Filesservice();
				String fidd=request.getParameter("fid");
				 
				List<Files> list=fi.select(fidd);
				String fname=null;
				if(	list!=null&&list.size()>0){
				
				  fname=list.get(0).getFname();
			}
			//处理请求  
			//读取要下载的文件  
			String re=getServletContext().getRealPath("upload");
			
        	File f = new File(re+"/"+fname);  
        	if(f.exists()){  
            FileInputStream  fis = new FileInputStream(f);  
            String filename=URLEncoder.encode(f.getName(),"utf-8"); //解决中文文件名下载后乱码的问题  
            byte[] b = new byte[fis.available()];  
            fis.read(b);  
        	
            //设置下载弹框中的文件名显示
            response.setHeader("Content-Disposition","attachment; filename="+filename+"");  
            //获取响应报文输出流对象  
            ServletOutputStream  out =response.getOutputStream();  
            //输出  
            out.write(b);  
            out.flush();  
            out.close(); 
        	
        }     
	}
	}

