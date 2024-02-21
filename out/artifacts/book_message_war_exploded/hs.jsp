<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>图书管理系统</title>
  <style type="text/css">
    h5{
      text-align: center;
      font-size: 450%;
      color: #426503;
      margin-top: 3%;
      border-color: #61842f;
      border-style: solid;
      margin-left: 15%;
      margin-right: 15%;
      background-image:url("bookimg/ct.webp") ;
    }
    nav{
      display:block;
      text-align: center;
      background:linear-gradient(to top, #d7f899, #afee3a, #e5f362);
      font-size: 300%;
      margin-left: 15%;
      margin-right: 15%;
      padding: 15px;
      border-radius: 20px;
      margin-top: -3%;
    }
    nav a:hover{
      color:white;
    }
    nav a:link,nav a:visited {
      display: inline;
      border: bottom 3px soild #fff;
      padding: 10%;
      text-decoration: none;
      font-weight: bold;
      margin: 2%;
    }
    .fl{
      margin-left: 20%;
      margin-right: 15%;
      margin-top: 1.2%;
      border-color: #61842f;
      background-image: url("");

    }
    h1{
      font-size: 225%;
      color:red;
      text-align: center;
      border-color: red;
      border-style: solid;
      margin-left: 25%;
      margin-right: 25%;
      letter-spacing: 8px;
      padding-top: 12px;
      padding-bottom: 12px;
    }
    </style>
<body>
    <h5>图书管理系统</h5>
<div id="sh">
    <nav>
        <a href="js.jsp"style="text-decoration: none">借书</a>
        <a href="hs.jsp"style="text-decoration: none">还书</a>
        <a href="dlu.jsp"style="text-decoration: none">登录</a>
    </nav>
</div>
    <h1>感谢您及时还书</h1>
    <div class="fl">
    选择图书分类：<select>
    <option>经典名著</option>
    <option>外国经典</option>
    <option>现代文学</option>
    <option>名人传记</option>
    </select>

    请输入书名：<input type="text" class="sm" required/>

    <input type="submit" value="确认">
    <input type="submit" value="还书">
    </div>


</body>
</html>