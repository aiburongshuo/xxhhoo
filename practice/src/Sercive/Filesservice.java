package Sercive;

import java.util.List;

import DAO.Files;
import Files.FilesDAO;
import Pojo.Student;

public class Filesservice implements Ifilesservice {
		FilesDAO file=new FilesDAO();
		Files   fil=new Files();
	@Override
	public int add(String fname, String fmaoshu) {
			
			fil.setFmaoshu(fmaoshu);
			fil.setFname(fname);
				
		return file.addfile(fil);
	}

	@Override
	public List<Files> select() {
		String sql="select * from files";
		   List<Files> s=file.selectfile(sql);
		  
		   if(s!=null&&s.size()>0){
			   
			   
			 return s;  
		   }
		return	null ;
				
	}

	@Override
	public List<Files> select(String fidd) {
		
		long fid=Long.valueOf(fidd);
		String sql="select * from files where fid='"+fid+"'";
		List<Files> list=file.selectfile(sql);
			if(list!=null&&list.size()>0){
				return list;
			}
		return null;
	}

}
