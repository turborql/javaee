<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
//服务端增加Cookie
Cookie cookie1=new Cookie("name","张三");
Cookie cookie2=new Cookie("pwd","123");
response.addCookie(cookie1);
response.addCookie(cookie2);

//页面跳转到客户端（请求转发、重定向）
response.sendRedirect("result.jsp");//重定向
%>


</body>
</html>