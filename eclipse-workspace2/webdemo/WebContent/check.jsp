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
request.setCharacterEncoding("utf-8");
String name=request.getParameter("name");
String pwd=request.getParameter("pwd");
if(name.equals("zhangsan")&&pwd.equals("123")){
	 //response.sendRedirect("success.jsp"); //重定向，导致数据丢失;此时页面跳转为success.jsp
	//页面跳转：请求转发,可以获取到数据，并且地址栏没有改变（仍然保留转发时的页面check.jsp）
	request.getRequestDispatcher("success.jsp").forward(request, response);
	
}else{
	out.print("登陆失败");
}

%>



</body>
</html>