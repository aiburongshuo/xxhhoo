package Sercive;

import java.util.List;

import DAO.Files;

public interface Ifilesservice {

	
	public int add(String fname, String fmaoshu);
	
	
	public List<Files> select();
	
	
	public List<Files> select(String fid);
		
	
}
