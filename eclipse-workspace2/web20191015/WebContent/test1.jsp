<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="test1.jsp">
<input type="text" name="usename">
<input type="submit">
</form>

<%
String name=request.getParameter("usename");
out.print("name="+name);
%>
</body>
</html>