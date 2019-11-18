<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	欢迎您:
	<%
	//将object的转为String
	String name = (String) session.getAttribute("name");
	/* request.getAttribute("name"); 也可以通过request获取*/
	//如果用户没有登录，而是直接通过地址栏访问welcome.jsp

	if (name != null) {
		out.print(name);
		System.out.println("sessionID:"+session.getId());
		
		
		
    %>
<a href="invalidate.jsp">注销</a>


	<%
		} else {
			response.sendRedirect("Login.jsp");
		}
	%>

</body>
</html>