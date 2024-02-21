<%--
  Created by IntelliJ IDEA.
  User: 徐启杰
  Date: 2022/6/22
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
    <style>
        .login-form {
            color:black;
            width: 350px;
            height: 500px;
            border-radius: 15px;
            text-align: center;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background-attachment: fixed;
            background-color: rgba(255,255,255,0.55);
        }

        .text {
            font-size: 30px;
            font-weight: 700;
            text-align: center;
            line-height: 80px;

            margin-top: 40px;
        }

        .form-item,
        .btn
        {
            margin: 40px auto;
            width: 90%;
        }


        input {
            width: 80%;
            margin-top: 20px;
            padding: 10px;
            /*text-transform: uppercase;*/
            border: 0;
            outline: none;
            border-bottom: 1px solid #fad3a4;
        }

        input::placeholder {
            font-weight: bold;
            color: #ff7433;
        }

        input:focus {
            animation: bBottom 2s infinite;
        }

        @keyframes bBottom {
            50% {
                border-bottom: 1px solid #fdfc90;
            }
        }

        .btn {
            height: 40px;
            line-height: 40px;
            color: #fdfcfc;
            font-weight: bold;
            letter-spacing: 10px;
            text-align: center;
            cursor: pointer;
            border-radius: 10px;
            /*background: linear-gradient(to right, #fad3a4, #fdfc90, #f6ab88);*/
            background-size: 200%;
        }

        .btn:hover {
            animation: btnAnimate 1s infinite;
        }

        @keyframes btnAnimate {
            50% {
                background-position: 200%;
            }
        }
        body{
            background-image: url("bookimg/bgd.webp");
            background-repeat: no-repeat;
            background-size: 100% 100%;
            background-position: center;
        }
        html{
            height: 100%;
        }
    </style>
</head>
<body>
<div class="login-form">
    <form method="post"name="form1"id="form1" action="${pageContext.request.contextPath}/LoginServlet">
        <div class="text">登录</div>
        <h3>登录更精彩！</h3>

        <div class="form-item">
            <input name="username" type="text" placeholder="用户名"id="yhm"style="background-color: rgba(255,255,255,0.1);">${errerMsg}<br><br>
            <input name="password"type="password" placeholder="密码"id="pw"style="background-color: rgba(255,255,255,0.1);"><br><br>
        </div>
        <div class="btn"><input type="submit"name="submit"id="submit" value="登录"></div>
    </form>
</div>
<footer>

</footer>
</body>
</html>