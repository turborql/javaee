<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>半圆学生系统</title>

<link href="css/bootstrap-combined.min.css" rel="stylesheet">
<link href="css/layoutit.css" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
    <![endif]-->

<!-- Fav and touch icons -->
<link rel="shortcut icon" href="img/favicon.png">

<script type="text/javascript" src="js/jquery-2.0.0.min.js"></script>
<!--[if lt IE 9]>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <![endif]-->
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery.ui.touch-punch.min.js"></script>
<script type="text/javascript" src="js/jquery.htmlClean.js"></script>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="ckeditor/config.js"></script>
<script type="text/javascript" src="js/scripts.js"></script>

</head>
<body>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
			<!-- 规定在图像无法显示时的代替文本 -->
				<img alt="140x140" src="img/a.jpg" class="img-circle" />
				<div class="logindiv">
				</div>
				
				<h2>
					<em>半圆学生管理系统</em>
				</h2>

				<p>20191015第一版</p>

			</div>
		</div>
		<div class="row-fluid">
			<div class="span3">
				<div class="accordion" id="accordion-192410">
					<div class="accordion-group">
						<div class="accordion-heading">
							<a class="accordion-toggle" data-parent="#accordion-192410"
								data-toggle="collapse" href="#accordion-element-537395">学生信息管理#1</a>
						</div>
						<div class="accordion-body collapse" id="accordion-element-537395">
							<div class="accordion-inner">查询学生信息</div>
							<div class="accordion-inner">修改学生信息</div>
						</div>
					</div>
					<div class="accordion-group">
						<div class="accordion-heading">
							<a class="accordion-toggle" data-parent="#accordion-192410"
								data-toggle="collapse" href="#accordion-element-311934">学生选课管理#2</a>
						</div>
						<div class="accordion-body collapse" id="accordion-element-311934">
							<div class="accordion-inner">查询学生选课信息</div>
							<div class="accordion-inner">修改学生选课信息</div>
						</div>
					</div>
				</div>
			</div>
			<div class="span9">
				<div class="row-fluid">
					<div class="span12">
						<form action="StudentServlet" method="get">
							<fieldset>
								<legend>表单项</legend>
								<label>按照姓名查询</label> <input type="text" name="name" />
								<button type="submit" class="btn" name="query"
									value="queryByName">查询</button>
								<button type="submit" class="btn" name="query" value="queryAll">查询全部</button>

							</fieldset>
						</form>
					</div>
				</div>
				<table class="table">
					<thead>
						<tr>
							<th>姓名</th>
							<th>年龄</th>
							<th>生日</th>
							
						</tr>
					</thead>
					<tbody>
						<c:set var="index" value="-1"></c:set>
						<c:forEach items="${students}" var="s">
							<c:set var="index" value="${ index+1}"></c:set>

							<tr class="${cla[index]}">
								<td>${s.name}</td>
								<td>${s.age}</td>
								<td>${s.birthday}</td>
								
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
	</div>


</body>
</html>