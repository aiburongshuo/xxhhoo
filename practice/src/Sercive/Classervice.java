package Sercive;

import java.util.List;

import DAO.Clas;
import DAO.ClasDAO;

public class Classervice implements Iclassercive {
		ClasDAO cc=new ClasDAO();
	@Override
	public List<Clas> haoba() {
			String  sql="select * from classs";
			List<Clas> li=cc.selectc(sql);
			if(li!=null&&li.size()>0){
				
				return li;
				
			}
		
		return null;
	}

}
