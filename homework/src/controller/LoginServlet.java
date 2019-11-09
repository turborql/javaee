package controller;

import domain.User;
import mapper.LoginDao;
import util.dbconn.BaseDb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author edz
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        String tel=req.getParameter("tel");
        LoginDao loginDao = new LoginDao();

//     try{   User user=loginDao.query(name,pwd);
//        if (user.getName().equals(name) && user.getPwd().equals(pwd)) {
//            System.out.println("登录成功");
//            req.setAttribute("name",name);
//            req.getRequestDispatcher("score.jsp").forward(req,resp);
//        }}catch ( NullPointerException e){
//            System.out.println("登录失败");
//            req.getRequestDispatcher("error.jsp").forward(req,resp);
//        }
            User user = loginDao.query(name, pwd,tel);
            if (user != null ) {
                System.out.println("登录成功");
                req.setAttribute("name", name);
                //目前数据库表中的未扣分的分数
                req.setAttribute("score",user.getScore());
                req.setAttribute("tel",user.getTel());
                req.setAttribute("pwd",user.getPwd());
                req.setAttribute("deduction",user.getDeduction());
                req.getRequestDispatcher("score.jsp").forward(req, resp);
            }else {
                System.out.println("登录失败");
                req.getRequestDispatcher("error.jsp").forward(req, resp);
            }
    }
}







