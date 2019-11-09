package controller;

import com.mysql.cj.Session;
import domain.User;
import mapper.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author edz
 */
public class ScoreServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //获取score.jsp页面的数据
        //扣分类型所代表的分数,这是form表单请求的数据
        int scored = Integer.parseInt(req.getParameter("type"));
        //session里面的数据
        String name=(String) req.getSession().getAttribute("name");
        String tel = (String) req.getSession().getAttribute("tel");
        int scoreOld = (Integer) req.getSession().getAttribute("score");
        int deduction = (Integer) req.getSession().getAttribute("deduction");
        String pwd = (String) req.getSession().getAttribute("pwd");


        //扣完分之后的分数
        int ponitNew=scoreCurrent(scored,scoreOld);

        //将获取的数据存入User对象
        User user = new User();
        user.setTel(tel);
        user.setScore(ponitNew);
        user.setDeduction(scored);
        user.setPwd(pwd);
        user.setName(name);
        LoginDao loginDao = new LoginDao();
        //更新数据库中的数据
        loginDao.modify(user);
        //查询更新后的数据，放入user对象中
        System.out.println(name+tel+pwd);
        User user1=loginDao.query(name,pwd,tel);
        req.setAttribute("deduction", user1.getDeduction());
        req.setAttribute("score",user1.getScore());
        req.setAttribute("name", user1.getName());

        req.getRequestDispatcher("scoreNew.jsp").forward(req, resp);
    }

    public int scoreCurrent(int scored, int scoreOld) {
        int point = 0;
        if (3 == scored) {
            point = scoreOld - 3;
            System.out.println("剩余分数" + point);
        } else if (6 == scored) {
            point = scoreOld - 6;
            System.out.println("剩余分数" + point);
        } else if (12 == scored) {
            point = scoreOld - 12;
            System.out.println("剩余分数" + point);
        }
        return point;
    }
}
