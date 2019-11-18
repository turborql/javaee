<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.Vector"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>半圆学生系统</title>

<link href="css/bootstrap-combined.min.css" rel="stylesheet">
<link href="css/layoutit.css" rel="stylesheet">
<link href="css/studentsystem.css" rel="stylesheet">

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
<!-- <script type="text/javascript" src="js/scripts.js"></script> -->
<script type="text/javascript" src="js/studentsystem.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<!-- <img alt="140x140" src="img/a.jpg" class="img-circle" /> -->
				<div class="logodiv"></div>
				<h2>
					<em>半圆学生管理系统</em>
				</h2>

				<p>20191015第一版</p>
				<p>
					<a class="btn" href="#">查看更多 »</a>
				</p>
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
				<table class="table">
					<thead>
						<tr>
							<th>编号</th>
							<th>姓名</th>
							<th>年龄</th>
							<th>出生日期</th>
							<th>性别</th>
							<th>删除</th>
							<th>修改</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ss}" var="item">
							<tr class="success">
								<td>${item.id}</td>
								<td>${item.name}</td>
								<td>${item.age}</td>
								<td>${item.birthday }</td>
								<td>${item.sex }</td>
								<td><a
									href="StudentDelServlet?delid=${item.id}&curPage=${curPage}"><img
										class="img-circle" src="img/del.jpg" width="20px"
										height="20px" /></a></td>
								<td><a  href="#modal-container-151208"
									role="button" class="btn update" data-toggle="modal">修改</a>
									
									</td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="5">共${sumPage}页,当前第${curPage}页, <a
								href="StudentServlet2?jumpPage=${curPage+1}">下一页</a> <a
								href="StudentServlet2?jumpPage=${curPage-1}">上一页</a> <a
								href="StudentServlet2?jumpPage=1">首页</a> <a
								href="StudentServlet2?jumpPage=${sumPage}">末页</a>

								<form action="StudentServlet2">
									<input type="text" name="jumpPage" value="${jumpPage}">
									<button type="submit" class="btn">跳转</button>
								</form>
							</td>
						</tr>

					</tbody>
				</table>
				<div class="row-fluid">
					<div class="span12">
						<form action="StudentServlet3" method="get">
							<fieldset>
								<legend>学生信息</legend>
								<label>姓名</label><input type="text" name="sname" /> <label>年龄</label><input
									type="text" name="sage" /> <label>出生日期</label><input
									type="text" name="sbirthday" /> <label>性别</label><input
									type="text" name="ssex" />
								<button type="submit" class="btn">添加</button>
							</fieldset>
						</form>
						
					</div>
				</div>

				<div id="modal-container-151208" class="modal hide fade"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>
						<h3 id="myModalLabel">标题栏</h3>
					</div>
					<div class="modal-body">
						<p>fdsfdsfdsfds</p>
						<div class="row-fluid">
                    <div class="span12">
                        <form action="StudentUpdateServlet" method="get">
                            <fieldset>
                                <legend>修改学生信息</legend>
                                <label>id</label><input type="text" name="sid" id="updateid" readonly="readonly"/>
                                <label>姓名</label><input type="text" name="sname" id="updatename"/> <label>年龄</label><input
                                    type="text" name="sage" id="updateage"/> <label>出生日期</label><input
                                    type="text" name="sbirthday" id="updatebirthday"/> <label>性别</label><input
                                    type="text" name="ssex" id=updatesex /><input type="hidden" name="curPage" value="${curPage }">
                                <button type="submit" class="btn">修改</button>
                            </fieldset>
                        </form>
                        
                    </div>
                </div>
						
					</div>
					<div class="modal-footer">
						<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
						<button class="btn btn-primary">保存设置</button>
					</div>
				</div>

			</div>
		</div>
	</div>

</body>
</html>