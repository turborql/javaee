<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%="当前项目的虚拟路径："+application.getContextPath() %><br>
<%="当前项目的实际路径："+application.getRealPath("/webdemo") %>
</body>
</html>