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
 * Servlet implementation class StudentUpdateServlet
 */
@WebServlet("/StudentUpdateServlet")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		StudentService ss = (StudentService) MyFactory.getInstance("studentService");
		
		String scurPage=request.getParameter("curPage");
		
		String sname=request.getParameter("sname");
		String sage=request.getParameter("sage");
		String sbirthday=request.getParameter("sbirthday");
		String ssex=request.getParameter("ssex");
		String sid=request.getParameter("sid");
		
		Student student=new Student();
		student.setId(Integer.parseInt(sid));
		student.setName(sname);
//		student.setAge(Integer.parseInt(sage));
//		student.setBirthday(sbirthday);
//		student.setSex(ssex);

		ss.updateData(student);
		int sumPage = ss.getSumPage(3);
		
		int curPage=Integer.parseInt(scurPage);
		int jumpPage=curPage;
		
		Vector<Student> students = ss.getData(jumpPage, 3);

		request.setAttribute("ss", students);

		request.setAttribute("sumPage", sumPage);
		request.setAttribute("jumpPage", jumpPage);
		request.setAttribute("curPage", jumpPage);
		

		request.getRequestDispatcher("studentsystem.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
