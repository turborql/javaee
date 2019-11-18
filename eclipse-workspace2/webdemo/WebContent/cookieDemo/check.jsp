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
//将用户名加入cookie中
Cookie cookie=new Cookie("name",name);//建议一般不要用中文，否则需要进行编码和解码处理
//位置要放在addCookie之前


cookie.setMaxAge(10);
response.addCookie(cookie);

response.sendRedirect("A.jsp");

%>



</body>
</html>