package com.banuan.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class JDBCUtil {
//	private BaseDB db = new BaseDB();

	public void modify(String sql, Object... args) {
		Connection conn = null;
		conn = BaseDB.getConnection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				System.out.println();
				ps.setObject(i + 1, args[i]);
			}
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			BaseDB.DBClose(conn, ps, null);
		}

	}

	public Vector query(String sql, ResultSetDB resultSetDB, Object... args) {

		Vector data = new Vector();

		Connection conn = null;
		conn = BaseDB.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			rs = ps.executeQuery();
			data = resultSetDB.getData(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDB.DBClose(conn, ps, null);
		}
		return data;
	} 

}
