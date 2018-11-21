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

/**
 * Servlet implementation class add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//要获取班级信息
					Classervice cl=new Classervice();
					List<Clas> list=cl.haoba();
				//把信息保存到请求
				 request.setAttribute("list", list);
				//跳转页面
				 request.getRequestDispatcher("jsp/addrenwu.jsp").forward(request, response);
		
	}

}
