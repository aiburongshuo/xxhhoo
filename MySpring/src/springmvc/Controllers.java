package springmvc;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import pojo.U;

@Controller
@RequestMapping
public class Controllers {

	@RequestMapping("/hh")
	public String hh(){
		
		return "hello";
		
	}
	@RequestMapping("/Login")
	public String user(String name,String pwd,String dat){
		
		System.out.println(name);
		return "hello";
		
	}
	
	
	@RequestMapping("/shaonian")
	public  String map(Map<String, Object> m){
		
		U u=new U();
		u.setUname("老文");
		u.setUsid(2);
		m.put("MESS", u);
		
		return "hello";
		
	}
	
	@RequestMapping("/mav")
	public ModelAndView mav(){
		
		ModelAndView mo=new ModelAndView();
		mo.addObject("mess", new U(123,"1234",new Date()));
		mo.setViewName("hello");
		return mo;
		
		
		
	}
	@RequestMapping("/re")
	public String request(HttpServletRequest req,HttpServletResponse resp){
		
		 HttpSession se=req.getSession();
		 se.setAttribute("nel", new U(123,"123",new Date()));
		
		 return "hello";
	}
	//json
	@RequestMapping(value="json")
	@ResponseBody
	public List<U> add(){
		
		List<U> u=new ArrayList<>();
		
		u.add(new U(1,"老吴大沙雕",new Date()));
		u.add(new U(2,"老文大沙雕",new Date()));
		
		return u;
	}
	//文件上传
		@RequestMapping(value="/upload",method=RequestMethod.POST)
		public String upload(HttpServletRequest req) throws Exception{
			MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)req;
	        MultipartFile file = mreq.getFile("file");
	        String miaoshu = mreq.getParameter("miaoshu");//获取普通表单元素
	        System.out.println(miaoshu);
	        String fileName = file.getOriginalFilename();
	        FileOutputStream fos = new FileOutputStream(req.getSession().getServletContext().getRealPath("/")+
	                "upload/"+fileName);
	        fos.write(file.getBytes());
	        fos.flush();
	        fos.close();
	        return "hello";
		}
	
	
	
	@InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }
	
}
