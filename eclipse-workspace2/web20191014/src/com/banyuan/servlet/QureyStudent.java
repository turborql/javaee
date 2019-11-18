package com.banyuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banuan.entity.Student;
import com.banyuan.db.StudentDB;

/**
 * Servlet implementation class QureyStudent
 */
@WebServlet("/QureyStudent")
public class QureyStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QureyStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doget");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");

		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html >\n" + "<html>\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n"
				+ "<title>Insert title here</title>\n" + "</head>\n" + "<body>\n"
				+ "<table style=\"width: 50%;height: 50%\" border=\"1\">\n" + "<tr>\n" + "\n" + "<td>姓名</td>\n"
				+ "<td>年龄</td>\n" + "</tr>\n");
		//将数据库查询的结果，填入表格，显示到浏览器中
		StudentDB st = new StudentDB();
		List<Student> ls = st.queryAllStudent();

		for (int i = 0; i < ls.size(); i++) {

			pw.println("<tr>\n" + "<td>" + ls.get(i).getName() + "</td>\n" + "<td>" + ls.get(i).getAge() + "</td>\n"
					+ "</tr>\n");
		}
		pw.println("</table>\n" + "</body>\n" + "</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
