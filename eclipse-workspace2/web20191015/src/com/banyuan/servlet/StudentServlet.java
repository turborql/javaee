package com.banyuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		StudentService ss=(StudentService)MyFactory.getInstance("studentService");
		String query=request.getParameter("query");
		String[] cla = {"success","error","warning","info"};
		request.setAttribute("cla", cla);
		if(query.equals("queryAll")) {
			Vector<Student> students=ss.getData(1, 10);
			
			request.setAttribute("students", students);
			
			request.getRequestDispatcher("studentsys.jsp").forward(request, response);
			
		}else if(query.equals("queryByName")){
			String name = request.getParameter("name");
			Student student1 = new Student();
			student1.setName(name);

			Vector<Student> students= ss.getDataByName(1, 10, student1);
			request.setAttribute("students", students);
			request.getRequestDispatcher("studentsys.jsp").forward(request, response);
		}
		
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
