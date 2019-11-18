package com.banyuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banyuan.db.StudentDB;

/**
 * Servlet implementation class InsertStudent
 */
@WebServlet("/insert")
public class InsertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertStudent() {
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
		System.out.println("doget");
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		// 向前台响应
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html >\n" + "<html>\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n"
				+ "<title>insertStudent</title>\n" + "</head>\n" + "<body>\n"
				+ "<form action=\"insert\" method=\"get\">\n" + "<input type=\"text\" name=\"studentName\">\n"
				+ "<input type=\"text \" name=\"studentAge\">\n" + "<input type=\"submit\" value=\"添加学生\">\n"
				+ "</form>\n" + "</body>\n" + "</html>");
		if (!((request.getParameter("studentAge")) == null)) {
			int age = Integer.parseInt(request.getParameter("studentAge"));

			String name = request.getParameter("studentName");
//		System.out.println("name="+name+",age="+age);
			StudentDB st = new StudentDB();
			st.insert(name, age);
		}
		
		
		
		
		

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
