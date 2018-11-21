package Files;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.Factory;
import DAO.Files;
import DAO.IfilesDAO;
import Pojo.Student;

public class FilesDAO implements IfilesDAO {
			Connection con=null;
			PreparedStatement ps=null;
			Statement   st=null;
			ResultSet  	rs=null;
	@Override
	public int addfile(Files f) {
		con=Factory.getcon();
		String sql="insert into files values(seq_fid.nextval,?,?)";		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, f.getFname());
			ps.setString(2, f.getFmaoshu());
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			
			Factory.close(con, st, rs);
			
		}
			
		return 0;
	}

	@Override
	public List<Files> selectfile(String sql) {
		List<Files> list = new ArrayList<>();
		try {
			con = Factory.getcon();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Files f = new Files();
				f.setFid(rs.getLong("fid"));
				f.setFname(rs.getString("fname"));
				f.setFmaoshu(rs.getString("fmaoshu"));
				
				//stu.setStuBirthday(rs.getTimestamp("stubirthday"));
				
				list.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Factory.close(con, st, rs);
		}
		return list;
	}

}
