<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
请输入用户名和密码，选择身份登录<br>
身份：<input type="radio" name="1">管理员<input type="radio" name="1">学生<br>
     
用户名：<input type="text" name="name"><br>
密码：&nbsp&nbsp&nbsp<input type="password" name="pwd"><br>
&nbsp&nbsp&nbsp&nbsp<input type="submit" value="注册">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="登录">



</form>

</body>
</html>