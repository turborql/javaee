<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="show.jsp" method="post">
用户名：<input type="text" name="uname"/><br/>
密码：<input type="password" name="upwd"/><br/>
年龄：<input type="text" name="uage"/><br/>
爱好：<br/>
<input type="checkbox" name="uhobbies" value="足球" />足球<br/>
<input type="checkbox" name="uhobbies" value="篮球"/>篮球<br/>
<input type="checkbox" name="uhobbies" value="排球"/>排球<br/>
<input type="submit" value="注册">
</form>
</body>
</html>