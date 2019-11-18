<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--定义一个全局变量  -->
<%!
String name;
%>
<!-- 遍历cookies,找到和"name"一样的那个值 -->
<%
Cookie[] cookies=request.getCookies();
boolean flag=false;
for(Cookie cookie: cookies){
	if(cookie.getName().equals("name")){
		name=cookie.getValue();
		flag=true;
	}
}
if(!flag){
	out.print("cookie以失效");
}else{
	out.print("cookie:"+name);
}

%>

<form action="check.jsp" method="post">
<!--  定义一个全局变量-->
用户名：<input type="text" name="name" value="<%=(name==null?"":name)%>"><br>
密码：<input type="password" name="pwd"><br>
<input type="submit" value="登录">
</form>
</body>
</html>