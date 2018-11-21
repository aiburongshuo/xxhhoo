package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Pojo.Student;

public class ClasDAO implements IclassDAO {
	Connection conn;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	@Override
	public int addc(Clas C) {
		
		return 0;
	}

	@Override
	public int deletec(Clas C) {
		
		return 0;
	}

	@Override
	public int updatec(Clas C) {
		
		return 0;
	}

	@Override
	public List<Clas> selectc(String sql) {
		List<Clas> ls = new ArrayList<>();
		try {
			conn = Factory.getcon();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Clas c = new Clas();
				c.setC_id(rs.getInt("c_id"));
				c.setC_name(rs.getString("c_name"));
				ls.add(c);
					
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Factory.close(conn, st, rs);
		}
		return ls;
	}


}
