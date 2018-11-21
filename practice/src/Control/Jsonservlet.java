package Control;

import java.awt.Panel;
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
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/Jsonservlet")
public class Jsonservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Service ser=new Service();
		
			List<Student> list=ser.selectstu();
			
			//JSONObject 把一个对象属性转化为字符串传到前端
			Panel pa=new Panel();
			JSONObject.fromObject(pa).toString(); 
			//JSONArray 
		  String sql=JSONArray.fromObject(list).toString();
		  PrintWriter pw=response.getWriter();
		  
		  pw.write(sql);
		  pw.flush();
		  pw.close();
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
