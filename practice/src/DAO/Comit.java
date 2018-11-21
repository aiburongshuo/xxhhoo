package DAO;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Control.MyDateFormart;
import Pojo.Student;
import Sercive.Classervice;
import Sercive.Service;


@WebServlet("/Comit")
public class Comit extends HttpServlet {
	private static final long serialVersionUID = 1L;
     Service Stu=new Service();
      Classervice CLA=new Classervice();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
			String mes="";
			String uid=request.getParameter("uid");
			String name=request.getParameter("name");
			String sex=request.getParameter("sex");
			String pwd=request.getParameter("pwd");
			String age=request.getParameter("age");
			String birthday=request.getParameter("birthday");
			String classid=request.getParameter("classs");
			
			Student stu = new Student();
			
			stu.setStuId(Integer.valueOf(uid));
			stu.setStuName(name);
			stu.setStuPwd(pwd);
			stu.setStuSex(sex);
			stu.setStuAge(age);
			stu.setC_id(Integer.valueOf(classid));
			
			try {
				stu.setStuBirthday(MyDateFormart.stringToDate(birthday, "yyyy-MM-dd"));
				int num = Stu.updatestudent(stu);
				if(num!=0){
					mes="修改成功";
				}else{
					mes="修改失败";
				}
				request.setAttribute("mes", mes);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			//把班级信息传递给页面
			List<Clas> list = CLA.haoba();
			request.setAttribute("list", list);
	
			request.getRequestDispatcher("jsp/Editor.jsp").forward(request, response);
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
