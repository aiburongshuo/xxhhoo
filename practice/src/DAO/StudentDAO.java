package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import Pojo.Student;

public class StudentDAO implements IstudentDAO {
	Connection conn;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public int addstu(Student stu) {
	
			try{
				conn = Factory.getcon();
				String sql = "insert into stu1 values(seq_stu.nextval,?,?,?,?,?,?)";
				ps = conn.prepareStatement(sql);
				ps.setString(1, stu.getStuName());
				ps.setString(2, stu.getStuPwd());
				ps.setString(3, stu.getStuSex());
				ps.setString(4, stu.getStuAge());
				ps.setInt(5, stu.getC_id());
				ps.setTimestamp(6, new Timestamp(stu.getStuBirthday().getTime()));
				
				return ps.executeUpdate();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				Factory.close(conn, st, rs);
			}
			return 0;
		}

		
	
	@Override
	public int deletestu(Student stu) {
		conn = Factory.getcon();
		String sql="delete from stu1 where stuid='"+stu.getStuId()+"'";
		try {
			ps=conn.prepareStatement(sql);
			
			return ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			
			Factory.close(conn, ps, rs);
			
		}
		
		
		return 0;
	}

	@Override
	public int updatestu(Student stu) {
		try{
			conn = Factory.getcon();
			String sql="update stu1 set Stuname=?,stupwd=?,stusex=?,stuage=?,c_id=?,stubirthday=? where stuid='"+stu.getStuId()+"'";
			ps = conn.prepareStatement(sql);
			ps.setString(1, stu.getStuName());
			ps.setString(2, stu.getStuPwd());
			ps.setString(3, stu.getStuSex());
			ps.setString(4, stu.getStuAge());
			ps.setInt(5, stu.getC_id());
			ps.setTimestamp(6, new Timestamp(stu.getStuBirthday().getTime()));
			
			return ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			Factory.close(conn, st, rs);
		}
		  	
		return 0;
	}

	@Override
	public List<Student> selectstu(String sql) {
		List<Student> list = new ArrayList<>();
		try {
			conn = Factory.getcon();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Student stu = new Student();
				stu.setStuId(rs.getInt("stuid"));
				stu.setStuName(rs.getString("stuname"));
				stu.setStuAge(rs.getString("stuage"));
				stu.setStuBirthday(rs.getTimestamp("stubirthday"));
				stu.setC_id(rs.getInt("c_id"));
				stu.setStuPwd(rs.getString("stupwd"));
				stu.setStuSex(rs.getString("stusex"));
				list.add(stu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Factory.close(conn, st, rs);
		}
		return list;
	}



	@Override
	public int sqlcount(String sql) {
		String countSql = "select count(1) from ("+sql+")";
		try{
			conn = Factory.getcon();
			st = conn.createStatement();
			rs = st.executeQuery(countSql);
			while(rs.next()){
				return rs.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			Factory.close(conn, st, rs);
		}
		return 0;
	}

		
		
	

}
