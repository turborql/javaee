<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019/10/30
  Time: 5:20 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>驾照查分系统</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        html {
            height: 100%;
        }

        body {
            height: 100%;
            background: #fff url(images/backgroud.png) 50% 50% no-repeat;
            background-size: cover;
        }

        .dowebok {
            position: absolute;
            left: 50%;
            top: 50%;
            width: 430px;
            height: 550px;
            margin: -300px 0 0 -215px;
            border: 1px solid #fff;
            border-radius: 20px;
            overflow: hidden;
        }

        .logo {
            width: 104px;
            height: 104px;
            margin: 50px auto 80px;
            background: url(images/login.png) 0 0 no-repeat;
        }

        .form-item {
            position: relative;
            width: 360px;
            margin: 0 auto;
            padding-bottom: 30px;
        }

        .form-item input {
            width: 288px;
            height: 48px;
            padding-left: 70px;
            border: 1px solid #fff;
            border-radius: 25px;
            font-size: 18px;
            color: #fff;
            background-color: transparent;
            outline: none;
        }

        .form-item button {
            width: 360px;
            height: 50px;
            border: 0;
            border-radius: 25px;
            font-size: 18px;
            color: #1f6f4a;
            outline: none;
            cursor: pointer;
            background-color: #fff;
        }

        #username {
            background: url(images/emil.png) 20px 14px no-repeat;
        }




        #password {
            background: url(images/password.png) 23px 11px no-repeat;
        }

        .tip {
            display: none;
            position: absolute;
            left: 20px;
            top: 52px;
            font-size: 14px;
            color: #f50;
        }

        .reg-bar {
            width: 360px;
            margin: 20px auto 0;
            font-size: 14px;
            overflow: hidden;
        }

        .reg-bar a {
            color: #fff;
            text-decoration: none;
        }

        .reg-bar a:hover {
            text-decoration: underline;
        }

        .reg-bar .reg {
            float: left;
        }

        .reg-bar .forget {
            float: right;
        }

        .dowebok ::-webkit-input-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #fff;
        }

        .dowebok :-moz-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #fff;
        }

        .dowebok ::-moz-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #fff;
        }

        .dowebok :-ms-input-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #fff;
        }

        @media screen and (max-width: 500px) {
            * {
                box-sizing: border-box;
            }

            .dowebok {
                position: static;
                width: auto;
                height: auto;
                margin: 0 30px;
                border: 0;
                border-radius: 0;
            }

            .logo {
                margin: 50px auto;
            }

            .form-item {
                width: auto;
            }

            .form-item input, .form-item button, .reg-bar {
                width: 100%;
            }
        }
    </style>
</head>
<body>
<form action="Login" method="post">
<div class="dowebok">
    <div class="logo"></div>
    <div class="form-item">
        <input id="username" type="text" autocomplete="off" placeholder="用户名" name="name">

    </div>
    <div class="form-item">
        <input id="usertel" type="text" autocomplete="off" placeholder="手机号码" name="tel">

    </div>
    <div class="form-item">
        <input id="password" type="password" autocomplete="off" placeholder="登录密码" name="pwd">

    </div>
    <div class="form-item">
        <button id="submit">登 录</button>
    </div>

</div>
<script src="images/jquery.min.js"></script>
<script>
    $(function () {
        $('input').val('')
        $('#submit').on('click', function () {
            $('.tip').show()
        })
    })
</script>

<div style="text-align:center;">
</div>
</form>
</body>
</html>