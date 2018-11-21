package Control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Pageattribute;
import Pojo.Student;
import Sercive.Service;


@WebServlet("/selectsut")

public class selectsut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	Service  se=new Service();	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String  index=request.getParameter("index");
		 int pageIndex=0;
		 if(index==null||"".equals(index)){
			 pageIndex=1;
			 
		 }else{
				try{
					pageIndex = Integer.valueOf(index);
				}catch (Exception e) {
					pageIndex = 1;
				}
			}
		 	
		 
		 
		 
		 	Pageattribute<Student> pb= se. selectstu(pageIndex, 3);
			
		if(pb!=null){
			request.setAttribute("pb", pb);
			request.getRequestDispatcher("jsp/listrenwu.jsp").forward(request, response);			
		}
		
		
		
		

		}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
