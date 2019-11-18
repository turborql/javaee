package snippet;

public class Snippet {
	<div class="wrapper">
			<div class="main-header">
				<!-- Logo Header -->
				<div class="logo-header" data-background-color="blue">
	
					<a href="index.html" class="logo"> <img
						src="assets/img/logo.svg" alt="navbar brand" class="navbar-brand">
					</a>
					<button class="navbar-toggler sidenav-toggler ml-auto" type="button"
						data-toggle="collapse" data-target="collapse" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"> <i class="icon-menu"></i>
						</span>
					</button>
					<button class="topbar-toggler more">
						<i class="icon-options-vertical"></i>
					</button>
					<div class="nav-toggle">
						<button class="btn btn-toggle toggle-sidebar">
							<i class="icon-menu"></i>
						</button>
					</div>
				</div>
				<!-- End Logo Header -->
	
				<!-- Navbar Header -->
				<nav class="navbar navbar-header navbar-expand-lg"
					data-background-color="blue2">
	
					<div class="container-fluid">
						<div class="collapse" id="search-nav">
							<form class="navbar-left navbar-form nav-search mr-md-3">
								<div class="input-group">
									<div class="input-group-prepend">
										<button type="submit" class="btn btn-search pr-1">
											<i class="fa fa-search search-icon"></i>
										</button>
									</div>
									<input type="text" placeholder="Search ..." class="form-control">
								</div>
							</form>
						</div>
						<ul class="navbar-nav topbar-nav ml-md-auto align-items-center">
							<li class="nav-item toggle-nav-search hidden-caret"><a
								class="nav-link" data-toggle="collapse" href="#search-nav"
								role="button" aria-expanded="false" aria-controls="search-nav">
									<i class="fa fa-search"></i>
							</a></li>
							<li class="nav-item dropdown hidden-caret"><a
								class="nav-link dropdown-toggle" href="#" id="messageDropdown"
								role="button" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false"> <i class="fa fa-envelope"></i>
							</a>
								<ul class="dropdown-menu messages-notif-box animated fadeIn"
									aria-labelledby="messageDropdown">
									<li>
										<div
											class="dropdown-title d-flex justify-content-between align-items-center">
											Messages <a href="#" class="small">Mark all as read</a>
										</div>
									</li>
									<li>
										<div class="message-notif-scroll scrollbar-outer">
											<div class="notif-center">
												<a href="#">
													<div class="notif-img">
														<img src="assets/img/jm_denis.jpg" alt="Img Profile">
													</div>
													<div class="notif-content">
														<span class="subject">Jimmy Denis</span> <span
															class="block"> How are you ? </span> <span class="time">5
															minutes ago</span>
													</div>
												</a> <a href="#">
													<div class="notif-img">
														<img src="assets/img/chadengle.jpg" alt="Img Profile">
													</div>
													<div class="notif-content">
														<span class="subject">Chad</span> <span class="block">
															Ok, Thanks ! </span> <span class="time">12 minutes ago</span>
													</div>
												</a> <a href="#">
													<div class="notif-img">
														<img src="assets/img/mlane.jpg" alt="Img Profile">
													</div>
													<div class="notif-content">
														<span class="subject">Jhon Doe</span> <span class="block">
															Ready for the meeting today... </span> <span class="time">12
															minutes ago</span>
													</div>
												</a> <a href="#">
													<div class="notif-img">
														<img src="assets/img/talha.jpg" alt="Img Profile">
													</div>
													<div class="notif-content">
														<span class="subject">Talha</span> <span class="block">
															Hi, Apa Kabar ? </span> <span class="time">17 minutes ago</span>
													</div>
												</a>
											</div>
										</div>
									</li>
									<li><a class="see-all" href="javascript:void(0);">See
											all messages<i class="fa fa-angle-right"></i>
									</a></li>
								</ul></li>
							<li class="nav-item dropdown hidden-caret"><a
								class="nav-link dropdown-toggle" href="#" id="notifDropdown"
								role="button" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false"> <i class="fa fa-bell"></i> <span
									class="notification">4</span>
							</a>
								<ul class="dropdown-menu notif-box animated fadeIn"
									aria-labelledby="notifDropdown">
									<li>
										<div class="dropdown-title">You have 4 new notification</div>
									</li>
									<li>
										<div class="notif-scroll scrollbar-outer">
											<div class="notif-center">
												<a href="#">
													<div class="notif-icon notif-primary">
														<i class="fa fa-user-plus"></i>
													</div>
													<div class="notif-content">
														<span class="block"> New user registered </span> <span
															class="time">5 minutes ago</span>
													</div>
												</a> <a href="#">
													<div class="notif-icon notif-success">
														<i class="fa fa-comment"></i>
													</div>
													<div class="notif-content">
														<span class="block"> Rahmad commented on Admin </span> <span
															class="time">12 minutes ago</span>
													</div>
												</a> <a href="#">
													<div class="notif-img">
														<img src="assets/img/profile2.jpg" alt="Img Profile">
													</div>
													<div class="notif-content">
														<span class="block"> Reza send messages to you </span> <span
															class="time">12 minutes ago</span>
													</div>
												</a> <a href="#">
													<div class="notif-icon notif-danger">
														<i class="fa fa-heart"></i>
													</div>
													<div class="notif-content">
														<span class="block"> Farrah liked Admin </span> <span
															class="time">17 minutes ago</span>
													</div>
												</a>
											</div>
										</div>
									</li>
									<li><a class="see-all" href="javascript:void(0);">See
											all notifications<i class="fa fa-angle-right"></i>
									</a></li>
								</ul></li>
							<li class="nav-item dropdown hidden-caret"><a
								class="nav-link" data-toggle="dropdown" href="#"
								aria-expanded="false"> <i class="fas fa-layer-group"></i>
							</a>
								<div
									class="dropdown-menu quick-actions quick-actions-info animated fadeIn">
									<div class="quick-actions-header">
										<span class="title mb-1">Quick Actions</span> <span
											class="subtitle op-8">Shortcuts</span>
									</div>
									<div class="quick-actions-scroll scrollbar-outer">
										<div class="quick-actions-items">
											<div class="row m-0">
												<a class="col-6 col-md-4 p-0" href="#">
													<div class="quick-actions-item">
														<i class="flaticon-file-1"></i> <span class="text">Generated
															Report</span>
													</div>
												</a> <a class="col-6 col-md-4 p-0" href="#">
													<div class="quick-actions-item">
														<i class="flaticon-database"></i> <span class="text">Create
															New Database</span>
													</div>
												</a> <a class="col-6 col-md-4 p-0" href="#">
													<div class="quick-actions-item">
														<i class="flaticon-file"></i> <span class="text">Create
															New Invoice</span>
													</div>
												</a>
											</div>
										</div>
									</div>
								</div></li>
							<li class="nav-item dropdown hidden-caret"><a
								class="dropdown-toggle profile-pic" data-toggle="dropdown"
								href="#" aria-expanded="false">
									<div class="avatar-sm">
										<img src="assets/img/profile.jpg" alt="..."
											class="avatar-img rounded-circle">
									</div>
							</a>
								<ul class="dropdown-menu dropdown-user animated fadeIn">
									<div class="dropdown-user-scroll scrollbar-outer">
										<li>
											<div class="user-box">
												<div class="avatar-lg">
													<img src="assets/img/profile.jpg" alt="image profile"
														class="avatar-img rounded">
												</div>
												<div class="u-text">
													<h4>Hizrian</h4>
													<p class="text-muted">hello@example.com</p>
													<a href="profile.html"
														class="btn btn-xs btn-secondary btn-sm">View Profile</a>
												</div>
											</div>
										</li>
										<li>
											<div class="dropdown-divider"></div> <a class="dropdown-item"
											href="#">My Profile</a> <a class="dropdown-item" href="#">My
												Balance</a> <a class="dropdown-item" href="#">Inbox</a>
											<div class="dropdown-divider"></div> <a class="dropdown-item"
											href="#">Account Setting</a>
											<div class="dropdown-divider"></div> <a class="dropdown-item"
											href="#">Logout</a>
										</li>
									</div>
								</ul></li>
						</ul>
					</div>
				</nav>
				<!-- End Navbar -->
			</div>
	
			<!-- Sidebar -->
			<div class="sidebar sidebar-style-2">
				<div class="sidebar-wrapper scrollbar scrollbar-inner">
					<div class="sidebar-content">
						<div class="user">
							<div class="avatar-sm float-left mr-2">
								<img src="assets/img/profile.jpg" alt="..."
									class="avatar-img rounded-circle">
							</div>
							<div class="info">
								<a data-toggle="collapse" href="#collapseExample"
									aria-expanded="true"> <span> 张三 <span
										class="user-level">Administrator</span> <span class="caret"></span>
								</span>
								</a>
								<div class="clearfix"></div>
	
								<div class="collapse in" id="collapseExample">
									<ul class="nav">
										<li><a href="#profile"> <span class="link-collapse">个人信息</span>
										</a></li>
										<li><a href="#edit"> <span class="link-collapse">修改个人信息</span>
										</a></li>
										<li><a href="#settings"> <span class="link-collapse">管理</span>
										</a></li>
									</ul>
								</div>
							</div>
						</div>
						<ul class="nav nav-primary">
							<li class="nav-item active"><a data-toggle="collapse"
								href="#dashboard" class="collapsed" aria-expanded="false"> <i
									class="fas fa-home"></i>
									<p>后台管理</p> <span class="caret"></span>
							</a>
								<div class="collapse" id="dashboard">
									<ul class="nav nav-collapse">
										<li><a href="index.html"> <span class="sub-item">首页</span>
										</a></li>
										<li><a href="student.html"> <span class="sub-item">学生信息管理</span>
										</a></li>
										<li><a href="score.html"> <span
												class="sub-item">课程信息管理</span>
										</a></li>
									</ul>
								</div></li>
							<li class="nav-section"><span class="sidebar-mini-icon">
									<i class="fa fa-ellipsis-h"></i>
							</span>
								<h4 class="text-section">系统管理</h4></li>
							<li class="nav-item"><a data-toggle="collapse" href="#base">
									<i class="fas fa-layer-group"></i>
									<p>权限管理</p> <span class="caret"></span>
							</a>
								<div class="collapse" id="base">
									<ul class="nav nav-collapse">
										<li><a href="components/avatars.html"> <span
												class="sub-item">权限管理</span>
										</a></li>
	
	
									</ul>
								</div></li>
							<li class="nav-item"><a data-toggle="collapse"
								href="#sidebarLayouts"> <i class="fas fa-th-list"></i>
									<p>用户管理</p> <span class="caret"></span>
							</a>
								<div class="collapse" id="sidebarLayouts">
									<ul class="nav nav-collapse">
										<li><a href="sidebar-style-1.html"> <span
												class="sub-item">用户管理</span>
										</a></li>
	
									</ul>
								</div></li>
	
	
							<li class="nav-item"><a data-toggle="collapse"
								href="#submenu"> <i class="fas fa-bars"></i>
									<p>后续开发功能。。。</p> <span class="caret"></span>
							</a>
								<div class="collapse" id="submenu">
									<ul class="nav nav-collapse">
										<li><a data-toggle="collapse" href="#subnav1"> <span
												class="sub-item">功能1。。。</span> <span class="caret"></span>
										</a>
											<div class="collapse" id="subnav1">
												<ul class="nav nav-collapse subnav">
													<li><a href="#"> <span class="sub-item">功能2.。。。</span>
													</a></li>
	
												</ul>
											</div></li>
									</ul>
								</div></li>
	
						</ul>
					</div>
				</div>
			</div>
			<!-- End Sidebar -->
	
			<div class="main-panel">
				<div class="content">
					<div class="panel-header bg-primary-gradient">
						<div class="page-inner py-5">
							<div
								class="d-flex align-items-left align-items-md-center flex-column flex-md-row">
								<div>
									<h2 class="text-white pb-2 fw-bold">Dashboard</h2>
									<h5 class="text-white op-7 mb-2">Free Bootstrap 4 Admin
										Dashboard</h5>
								</div>
								<div class="ml-md-auto py-2 py-md-0">
									<a href="#" class="btn btn-white btn-border btn-round mr-2">Manage</a>
									<a href="#" class="btn btn-secondary btn-round">Add Customer</a>
								</div>
							</div>
						</div>
					</div>
					<div class="page-inner mt--5">
						<div class="row row-card-no-pd">
							<div class="col-md-12">
								<div class="card">
									<div class="card-header">
										<div class="card-head-row card-tools-still-right">
											<h4 class="card-title">课程得分信息表</h4>
											<div class="card-tools">
												<button class="btn btn-icon btn-link btn-primary btn-xs">
													<span class="fa fa-angle-down"></span>
												</button>
	
											</div>
										</div>
										<p class="card-category">Map of the distribution of users
											around the world</p>
									</div>
									<div class="card-body">
										<div class="row">
											<div class="col-md-12">
												<div class="table-responsive table-hover table-sales">
													<table class="table">
														<tbody>
															<!-- 学号 姓名 性别 宿舍号码 电话号码 -->
															<!-- 学号 课程编号 课程名称 学分 平时成绩 实验成绩 卷面成绩 综合成绩 实得学分 -->
															<tr>
																<td>
																	<div class="text-right">学号</div>
																</td>
																<td class="text-right">课程编号</td>
																<td class="text-right">课程名称</td>
																<td class="text-right">学分</td>
																<td class="text-right">平时成绩</td>
																<td class="text-right">实验成绩</td>
																<td class="text-right">卷面成绩</td>
																<td class="text-right">综合成绩</td>
																<td class="text-right">实得学分</td>
															</tr>
															<tr>
																<td>
	                                                                <div class="text-right">01</div>
	                                                            </td>
	                                                            <td class="text-right">A01</td>
	                                                            <td class="text-right">大学物理</td>
	                                                            <td class="text-right">3</td>
	                                                            <td class="text-right">66</td>
	                                                            <td class="text-right">78</td>
	                                                            <td class="text-right">82</td>
	                                                            <td class="text-right">0</td>
	                                                            <td class="text-right">0</td>
															</tr>
															<tr>
	                                                            <td>
	                                                                <div class="text-right">02</div>
	                                                            </td>
	                                                            <td class="text-right">A01</td>
	                                                            <td class="text-right">大学物理</td>
	                                                            <td class="text-right">3</td>
	                                                            <td class="text-right">66</td>
	                                                            <td class="text-right">78</td>
	                                                            <td class="text-right">82</td>
	                                                            <td class="text-right">0</td>
	                                                            <td class="text-right">0</td>
	                                                        </tr>
	                                                        <tr>
	                                                            <td>
	                                                                <div class="text-right">03</div>
	                                                            </td>
	                                                            <td class="text-right">A01</td>
	                                                            <td class="text-right">大学物理</td>
	                                                            <td class="text-right">3</td>
	                                                            <td class="text-right">66</td>
	                                                            <td class="text-right">78</td>
	                                                            <td class="text-right">82</td>
	                                                            <td class="text-right">0</td>
	                                                            <td class="text-right">0</td>
	                                                        </tr>
														</tbody>
													</table>
												</div>
											</div>
	
										</div>
									</div>
								</div>
							</div>
						</div>
	
					</div>
				</div>
				<footer class="footer">
					<div class="container-fluid">
						<nav class="pull-left">
							<ul class="nav">
								<li class="nav-item"><a class="nav-link" href="#">
										ThemeKita </a></li>
								<li class="nav-item"><a class="nav-link" href="#"> Help
								</a></li>
								<li class="nav-item"><a class="nav-link" href="#">
										Licenses </a></li>
							</ul>
						</nav>
						<div class="copyright ml-auto">
							Copyright &copy; 2019.Company name All rights reserved.<a
								target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
						</div>
					</div>
				</footer>
			</div>
	
	
		</div>
		<!--   Core JS Files   -->
		<script src="assets/js/core/jquery.3.2.1.min.js"></script>
		<script src="assets/js/core/popper.min.js"></script>
		<script src="assets/js/core/bootstrap.min.js"></script>
	
		<!-- jQuery UI -->
		<script src="assets/js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
		<script
			src="assets/js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js"></script>
	
		<!-- jQuery Scrollbar -->
		<script src="assets/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>
	
	
		<!-- Chart JS -->
		<script src="assets/js/plugin/chart.js/chart.min.js"></script>
	
		<!-- jQuery Sparkline -->
		<script src="assets/js/plugin/jquery.sparkline/jquery.sparkline.min.js"></script>
	
		<!-- Chart Circle -->
		<script src="assets/js/plugin/chart-circle/circles.min.js"></script>
	
		<!-- Datatables -->
		<script src="assets/js/plugin/datatables/datatables.min.js"></script>
	
		<!-- Bootstrap Notify -->
		<script src="assets/js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>
	
		<!-- jQuery Vector Maps -->
		<script src="assets/js/plugin/jqvmap/jquery.vmap.min.js"></script>
		<script src="assets/js/plugin/jqvmap/maps/jquery.vmap.world.js"></script>
	
		<!-- Sweet Alert -->
		<script src="assets/js/plugin/sweetalert/sweetalert.min.js"></script>
	
		<!-- Atlantis JS -->
		<script src="assets/js/atlantis.min.js"></script>
	
		<!-- Atlantis DEMO methods, don't include it in your project! -->
		<script src="assets/js/setting-demo.js"></script>
		<script src="assets/js/demo.js"></script>
		<script>
			Circles.create({
				id : 'circles-1',
				radius : 45,
				value : 60,
				maxValue : 100,
				width : 7,
				text : 5,
				colors : [ '#f1f1f1', '#FF9E27' ],
				duration : 400,
				wrpClass : 'circles-wrp',
				textClass : 'circles-text',
				styleWrapper : true,
				styleText : true
			})
	
			Circles.create({
				id : 'circles-2',
				radius : 45,
				value : 70,
				maxValue : 100,
				width : 7,
				text : 36,
				colors : [ '#f1f1f1', '#2BB930' ],
				duration : 400,
				wrpClass : 'circles-wrp',
				textClass : 'circles-text',
				styleWrapper : true,
				styleText : true
			})
	
			Circles.create({
				id : 'circles-3',
				radius : 45,
				value : 40,
				maxValue : 100,
				width : 7,
				text : 12,
				colors : [ '#f1f1f1', '#F25961' ],
				duration : 400,
				wrpClass : 'circles-wrp',
				textClass : 'circles-text',
				styleWrapper : true,
				styleText : true
			})
	
			var totalIncomeChart = document.getElementById('totalIncomeChart')
					.getContext('2d');
	
			var mytotalIncomeChart = new Chart(totalIncomeChart, {
				type : 'bar',
				data : {
					labels : [ "S", "M", "T", "W", "T", "F", "S", "S", "M", "T" ],
					datasets : [ {
						label : "Total Income",
						backgroundColor : '#ff9e27',
						borderColor : 'rgb(23, 125, 255)',
						data : [ 6, 4, 9, 5, 4, 6, 4, 3, 8, 10 ],
					} ],
				},
				options : {
					responsive : true,
					maintainAspectRatio : false,
					legend : {
						display : false,
					},
					scales : {
						yAxes : [ {
							ticks : {
								display : false
							//this will remove only the label
							},
							gridLines : {
								drawBorder : false,
								display : false
							}
						} ],
						xAxes : [ {
							gridLines : {
								drawBorder : false,
								display : false
							}
						} ]
					},
				}
			});
	
			$('#lineChart').sparkline([ 105, 103, 123, 100, 95, 105, 115 ], {
				type : 'line',
				height : '70',
				width : '100%',
				lineWidth : '2',
				lineColor : '#ffa534',
				fillColor : 'rgba(255, 165, 52, .14)'
			});
		</script>
}

