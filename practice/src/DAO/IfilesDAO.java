package DAO;

import java.util.List;

public interface IfilesDAO {

	
	public int addfile(Files f);
	
	
	
	public List<Files> selectfile(String sql);
	
}
