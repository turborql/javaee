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
		PrintWriter out= response.getWriter();
		out.println("<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"<head>\n" + 
				"<meta charset=\"UTF-8\">\n" + 
				"<title>Insert title here</title>\n" + 
				"</head>\n" + 
				"<body>\n" + 
				"	<table>\n" + 
				"		<tr>\n" + 
				"			<td>id</td>\n" + 
				"			<td>name</td>\n" + 
				"			<td>age</td>\n" + 
				"			<td>birthday</td>\n" + 
				"			<td>sex</td>\n" + 
				"		</tr>\n" + 
				"");
		
		StudentService ss=(StudentService)MyFactory.getInstance("studentService");
		Vector<Student> students=ss.getData(1, 3);
		
		System.out.println("students="+students);
		for(int i=0;i<students.size();i++) {
			Student s=students.get(i);
			out.println("<tr>\n" + 
					"            <td>"+s.getId()+"</td>\n" + 
					"            <td>"+s.getName()+"</td>\n" + 
//					"            <td>"+s.getAge()+"</td>\n" + 
//					"            <td>"+s.getBirthday()+"</td>\n" + 
//					"            <td>"+s.getSex()+"</td>\n" + 
					"        </tr>\n" + 
					"");
		}
		
		
		
		out.println("</table>\n" + 
				"</body>\n" + 
				"</html>");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
