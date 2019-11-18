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
	//登录成功
	//只有登录成功，session中才会存在name/pwd
	session.setAttribute("name", name);
	session.setAttribute("pwd", pwd);
	//将sessionID在控制台打印
    System.out.println("sessionID:"+session.getId());
	//服务端产生一个Cookie
	/* Cookie cookie=new Cookie("name",name);
		response.addCookie(cookie);
	request.getRequestDispatcher("welcome.jsp").forward(request, response);
	 */
	 
	
}else{
	//登录失败
	response.sendRedirect("login.jsp");
}

%>

</body>
</html>