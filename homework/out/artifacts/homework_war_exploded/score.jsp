<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019/10/27
  Time: 7:45 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
    <!-- Google fonts - Montserrat for headings, Cardo for copy-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700|Cardo:400,400italic,700">
    <!-- Lightbox-->
    <link rel="stylesheet" href="vendor/lightbox2/css/lightbox.min.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" href="img/favicon.png">
    <!-- Leaflet CSS - For the map-->
    <link rel="stylesheet" href="css/leaflet.css">
    <!-- Tweaks for older IEs--><!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<form action="Score" method="post">
    <body>
    <h2 class="heading">Welcome</h2>
        <%
    out.print(  request.getAttribute("name") + "登录成功！");
%>

    <!-- about-->
    <section id="about" class="text">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">

                    <p class="lead">This can be an about option.</p>
                    扣分类型：
                    <select name="type">
                        <option>请点击选择扣分类型</option>
                        <option value="3">违停-3</option>
                        <option value="6">闯红灯-6</option>
                        <option value="12">酒驾-12</option>
                    </select>
                    <input type="submit" value="submit">
                    <br>
                </div>
                <div class="col-lg-5 mx-auto">
                    <p><img src="img/japan-mountains.jpg" alt="" class="img-fluid rounded-circle"></p>
                </div>
            </div>
        </div>
    </section>
    <!-- about end-->
        <%
        session.setAttribute("score",request.getAttribute("score"));
        session.setAttribute("tel",request.getAttribute("tel"));
        session.setAttribute("pwd",request.getAttribute("pwd"));
        session.setAttribute("deduction",request.getAttribute("deduction"));
        session.setAttribute("name",request.getAttribute("name"));
    %>
    <!-- JavaScript files-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="vendor/jquery.cookie/jquery.cookie.js"></script>
    <script src="vendor/lightbox2/js/lightbox.min.js"></script>
    <script src="js/leaflet.js"></script>
    <script src="js/front.js"></script>

</form>
</body>
</html>
