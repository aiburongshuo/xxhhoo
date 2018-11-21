package Control;

public class Myselect {

	public  static String Myselects(String sql, int pageIndex,int pageCount){
		String sq="select * from (select t.*,rownum n from ("+sql+") t) tab where tab.n>"+(pageIndex-1)*pageCount+" and tab.n<="+pageIndex*pageCount; 
		
		
		
		return sq;
		
		
	}
}
