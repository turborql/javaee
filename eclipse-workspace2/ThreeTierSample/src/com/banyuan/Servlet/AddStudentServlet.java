package com.banyuan.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banyuan.Service.StudentService;
import com.banyuan.entity.Student;

/**
 * Servlet implementation class AddStudnetServlet
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doget========");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		//获取前台传递的数据，并封装成一个javabean
				int sno=Integer.parseInt(request.getParameter("sno"));
				int sage=Integer.parseInt(request.getParameter("sage"));
				String saddress=request.getParameter("saddress");
				String sname=request.getParameter("sname");
				Student student=new Student (sno,saddress,sage,sname);
				
				StudentService studentService=new StudentService();
				boolean result=studentService.addStudent(student);
				if(result) {
					//jsp的内置对象out
					response.getWriter().println("添加成功");
				}else {
					response.getWriter().println("添加失败");
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
	}

}
