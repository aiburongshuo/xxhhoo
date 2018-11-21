package Control;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Clas;
import DAO.ClasDAO;
import DAO.StudentDAO;
import Pojo.Student;
import Sercive.Classervice;


@WebServlet("/Addstu")
public class Addstu extends HttpServlet {
	private static final long serialVersionUID = 1L;
		StudentDAO STU=new StudentDAO();
			Classervice CLA=new Classervice();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mes="";
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String pwd=request.getParameter("pwd");
		String age=request.getParameter("age");
		String birthday=request.getParameter("birthday");
		String classid=request.getParameter("classs");
		
		Student stu = new Student();
		stu.setStuName(name);
		stu.setStuPwd(pwd);
		stu.setStuSex(sex);
		stu.setStuAge(age);
		stu.setC_id(Integer.valueOf(classid));
		
		try {
			stu.setStuBirthday(MyDateFormart.stringToDate(birthday, "yyyy-MM-dd"));
			int num = STU.addstu(stu);
			if(num!=0){
				mes="添加成功";
			}else{
				mes="添加失败";
			}
			//把班级信息传递给页面
			List<Clas> list = CLA.haoba();
			request.setAttribute("list", list);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		request.setAttribute("mes", mes);
		request.getRequestDispatcher("jsp/addrenwu.jsp").forward(request, response);
		
		
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
