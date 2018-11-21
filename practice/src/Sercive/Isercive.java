package Sercive;

import java.util.List;

import DAO.Pageattribute;
import Pojo.Student;

public interface Isercive {

	public Student login(String name, String pwd);
	
	public int addst(Student stu);
	
	public 	List<Student> selectstu();
	
	public Pageattribute<Student> selectstu(int pageIndex,int pageCount);
 
	
	public int updatestudent(Student stu);
	
	public int deletestudent(String id);
	
	
	public List<Student> selectstu(String name);
	
}
