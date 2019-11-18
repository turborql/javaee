<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8"> 
<title>Insert title here</title>
</head>
<body>
	<%
		application.setAttribute("hello", "abc");
		/* request.getRequestDispatcher("rq1.jsp").forward(request, response); */
		response.sendRedirect("app1.jsp");
	%>
</body>
</html>