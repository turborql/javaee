<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AddStudentServlet" >
		学号：<input type="text" name="sno"><br>
	    姓名：<input type="text" name="sname"><br> 
		年龄：<input type="text " name="sage"><br> 
		地址：<input type="text" name="saddress"><br>
		<input type="submit"  value="增加学生信息">
	</form>
    <%--String s= null;--%>

	
	<% /* out.print("===="); */ %>

</body>
</html>