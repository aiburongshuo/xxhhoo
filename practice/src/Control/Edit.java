package Control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Clas;
import Sercive.Classervice;


@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTf-8");
	
		Classervice cl=new Classervice();
		List<Clas> list=cl.haoba();
		
		String uid=request.getParameter("uid");	
		
		//����Ϣ���浽����
		request.setAttribute("uid", uid);
		request.setAttribute("list", list);
		request.getRequestDispatcher("jsp/Editor.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
