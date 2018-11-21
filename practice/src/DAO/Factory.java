package DAO;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;




public class Factory {
	private static String DRIVAR;
	private static String URL;
	private static String USER;
	private static String PASSWORD;
	static{
	Properties pro=new Properties();
	InputStream in=Factory.class.getResourceAsStream("jdbc.properties");
	
	try {
		pro.load(in);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	DRIVAR=pro.getProperty("jdbc.drivar");
	URL=pro.getProperty("jdbc.url");
	USER=pro.getProperty("jdbc.user");
	PASSWORD=pro.getProperty("jdbc.password");
}	
	
	
		
		public static Connection getcon(){
			
			Connection con=null;
		try {
				
				//注册驱动
				Class.forName(DRIVAR);
				
				
				
				// 获取连接对象
				con=DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			return con;
		}
		
		public static void close(Connection con,Statement st, ResultSet rs){
		
		try {
			  if(rs!=null)
				rs.close();
			} catch (SQLException e2) {
					
				e2.printStackTrace();
			}
	
	
		 try {
			 if(st!=null)
			st.close();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		try {
			if(con!=null)
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
			
			
	}
}