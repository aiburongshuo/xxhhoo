package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Pojo.Student;
import Sercive.Service;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
			Service se=new Service();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
				String mc="”√ªß√˚√‹¬Î¥ÌŒÛ";
				String err="123";
		  	String user= request.getParameter("user");
		  	String pwd=request.getParameter("pwd");
			
		  	Student stu=se.login(user, pwd);
		  
		  	if(stu!=null){
		      HttpSession session=request.getSession();
		      session.setAttribute("stu",stu);
		      response.sendRedirect("index.jsp");
		  	}else{
		  		request.setAttribute("err", err);
		  		request.setAttribute("mc", mc);	
		  		request.getRequestDispatcher("login.jsp").forward(request, response);
		  		
		  	} 	
	}	
		
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
