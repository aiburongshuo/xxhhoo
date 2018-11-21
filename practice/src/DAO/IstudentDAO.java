package DAO;

import java.util.List;

import Pojo.Student;

public interface IstudentDAO {

	public int addstu(Student stu);	
	
	
	public int deletestu(Student stu);
	
	
	public int updatestu(Student stu);
	
	
	public List<Student> selectstu(String sql);
	
	
	
	public int sqlcount(String sql);
	
}
