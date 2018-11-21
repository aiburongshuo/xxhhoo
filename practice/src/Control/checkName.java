package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Pojo.Student;
import Sercive.Service;


@WebServlet("/checkName")

	
public class checkName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    		Service se=new Service();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 String name=request.getParameter("name");
			 List<Student> list = se.selectstu(name);
				PrintWriter pw = response.getWriter();
				if(list!=null&&list.size()>0){//ÖØÃû
					pw.write("true");
				}else{
					pw.write("flase");
				}
				pw.flush();
				pw.close();
	
	
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		doGet(request, response);
	}

}
