package Sercive;

import java.util.List;

import Control.Myselect;
import DAO.Pageattribute;
import DAO.StudentDAO;
import Pojo.Student;

public class Service implements Isercive {
		StudentDAO st=new StudentDAO();
	@Override
	public Student login(String name, String pwd) {
			String sql="select * from stu1 where stuname='"+name+"'and stupwd='"+pwd+"'";
		   List<Student> s=st.selectstu(sql);
		  
		   if(s!=null&&s.size()>0){
			   
			   
			 return s.get(0);  
		   }
		
		
		
		return null;
	}
	@Override
	public int addst(Student stu) {
			
		
		
		
		return st.addstu(stu);
	}
	@Override
	public List<Student> selectstu() {
		String sql="select * from stu1";
		   List<Student> s=st.selectstu(sql);
		  
		   if(s!=null&&s.size()>0){
			   
			   
			 return s;  
		   }
		return	null ;
	}
	@Override
	public int updatestudent(Student stu) {
		
		
		return st.updatestu(stu);
	}
	@Override
	public int deletestudent(String id) {
		
		Student stu = new Student();
		
		stu.setStuId(Integer.valueOf(id));
		
		return st.deletestu(stu);
		
		
	}
	@Override
	public List<Student> selectstu(String name) {
		
		return st.selectstu("select * from stu1 where stuname='"+name+"'");
	}
	@Override
	public Pageattribute<Student> selectstu(int pageIndex, int pageCount) {
			Pageattribute<Student> pg=new Pageattribute<>();
		
			int count=st.sqlcount("select * from stu1 ");//获取总数
		
		
		List<Student> list=st.selectstu(Myselect.Myselects("select * from stu1",pageIndex,pageCount));
		//获取查询的全部内容 	 
		
		pg.setCount(count);
		pg.setList(list);
		pg.setPageCount(pageCount);
		pg.setPageIndex(pageIndex);
			
		return pg;
	}
	
	
		
		
	

}
