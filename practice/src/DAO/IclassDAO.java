package DAO;

import java.util.List;

import Pojo.Student;

public interface IclassDAO {

public int addc(Clas C);	
	
	
	public int deletec(Clas C);
	
	
	public int updatec(Clas C);
	
	
	public List<Clas> selectc(String sql);
	
	
	
}
