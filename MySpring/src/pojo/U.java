package pojo;

import java.util.Date;
import java.util.List;

public class U {
	
	private  int usid;
	private String uname;
	private Date my_time;
	
	public int getUsid() {
		return usid;
	}
	public void setUsid(int usid) {
		this.usid = usid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getMy_time() {
		return my_time;
	}
	public void setMy_time(Date my_time) {
		this.my_time = my_time;
	}
	
	@Override
	public String toString() {
		return "U [usid=" + usid + ", uname=" + uname + ", my_time=" + my_time + "]";
	}
	public U(int usid, String uname, Date my_time) {
		super();
		this.usid = usid;
		this.uname = uname;
		this.my_time = my_time;
	}
	public U(){
		
	}
}
