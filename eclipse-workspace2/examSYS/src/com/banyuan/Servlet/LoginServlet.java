package com.banyuan.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banyuan.Dao.LoginDao;
import com.banyuan.entity.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// 设置编码格式
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");
				System.out.println("doget");
				String name=request.getParameter("name");
				String pwd=request.getParameter("pwd");
				//将获取的用户信息存入实体类
				Login login=new Login();
				login.setName(name);
				login.setPassword(pwd);
				System.out.println(login);
				//调用dao层方法查询
				LoginDao logindao=new LoginDao();
				int result=logindao.query(login);
				System.out.println(result);
				if(result>0) {
				
					response.sendRedirect("123/ql.jsp");
				}else {
					response.sendRedirect("login.jsp");
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		

	}

}
