package mapper;

import domain.User;
import util.dbconn.BaseDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao {
    //更新（增，删，改）
    public void modify(User user) {
        Connection conn = BaseDb.getConnection();
        PreparedStatement ps = null;
        String sql = "update  user set score=?,deduction=? where name=? and tel=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, user.getScore());
            ps.setInt(2, user.getDeduction());
            ps.setString(3, user.getName());
            ps.setString(4,user.getTel());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BaseDb.DBClose(conn, ps, null);
        }

    }


    // 查询
    public User query(String name, String pwd, String tel) {
        User user = null;
        Connection conn = BaseDb.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from user where name=? and tel=? and pwd=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, tel);
            ps.setString(3,pwd);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = new User();
                String uname = rs.getString("name");
                int uscore = rs.getInt("score");
                String upwd = rs.getString("pwd");
                int udeduction = rs.getInt("deduction");
                String utel = rs.getString("tel");
                user.setPwd(upwd);
                user.setName(uname);
                user.setDeduction(udeduction);
                user.setScore(uscore);
                user.setTel(utel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BaseDb.DBClose(conn, ps, rs);
        }
        return user;
    }
}
