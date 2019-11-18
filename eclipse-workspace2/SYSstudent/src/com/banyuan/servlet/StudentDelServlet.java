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
 * Servlet implementation class StudentDelServlet
 */
@WebServlet("/StudentDelServlet")
public class StudentDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		StudentService ss = (StudentService) MyFactory.getInstance("studentService");

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String delid=request.getParameter("delid");
		System.out.println("delid="+delid);
		
		Student student=new Student();
		student.setId(Integer.parseInt(delid));
		ss.deleteData(student);
		
		//当删除最后一页数据的所有数据时，此时页数会-1
		//所以，删除完数据后，需要重新计算总页数
		//所以，如果最后一页数据被全部删除了，需要跳转到现在最新的末页
		int sumPage = ss.getSumPage(3);
		
		String curPage=request.getParameter("curPage");
		int jumpPage=Integer.parseInt(curPage);
		if(jumpPage>sumPage) {
			jumpPage=sumPage;
		}
		
		
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
