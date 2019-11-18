package com.banyuan.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banyuan.entity.Student;
import com.banyuan.service.StudentService;
import com.banyuan.util.MyFactory;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet2")
public class StudentServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentServlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentService ss = (StudentService) MyFactory.getInstance("studentService");
		response.setCharacterEncoding("utf-8");

		String jump = request.getParameter("jumpPage");
		int jumpPage = 0;
		
		int sumPage = ss.getSumPage(3);

		if (jump == null || jump.trim().equals("") || "0".equals(jump)) {
			jumpPage = 1;
		} else {
			
			try {
				jumpPage = Integer.parseInt(jump);
				if(jumpPage>sumPage) {
					jumpPage=sumPage;
				}
				
			}
			catch (Exception e) {
				jumpPage = 1;
			}
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		Vector<Student> students = ss.getData(jumpPage, 3);

		request.setAttribute("ss", students);
		// sumPage curPage jumpPage

		request.setAttribute("sumPage", sumPage);
		request.setAttribute("jumpPage", jumpPage);
		request.setAttribute("curPage", jumpPage);

//		request.getRequestDispatcher("test03.jsp").forward(request, response);
		request.getRequestDispatcher("studentsystem.jsp").forward(request, response);

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
