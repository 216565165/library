<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        nav a:link,nav a:visited{
            display:inline;
            border: bottom 3px soild #fff;
            padding:10%;
            text-decoration: none;
            font-weight: bold;
            margin:2%;
        }
        aside{
            position: absolute;
            width: 150px;
            height: 300px;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            background: linear-gradient(to top, #64f60a, #a6f637, #b1fa05);
            border-radius: 10px;
            transition: .3s;
            overflow: hidden;
            margin-top: 100px;
            margin-left: 15%;
            font-size: 0.5cm;
            color:black;
        }
        .as{
            color:white;
        }
        .zt{
            border-image: linear-gradient(to top, #d7f899, #afee3a, #e5f362);
            margin-left: 25%;
            margin-right: 20%;

            align:center;
        }
        .books{
            width: 225px;
            height: 300px;
            margin-top: 3%;
            background-image: url("bookimg/bg.gif");
            align:center;

        }
        table{
            border-spacing: 40px;

        }
        .bookname{
            font-size: 125%;
            color:black;
            text-align: center;
        }
        .bt{
            text-align: center;
            color:#426503;
            margin-left: 15%;
            margin-right: 15%;
            border-color: #61842f;
            font-size: 250%;
            margin-bottom: -1.7%;
            border-style: solid;
            margin-top: 2%;
        }
    </style>
</head>
<body>
<h5>图书管理系统</h5>
<div id="sh">
    <nav>
        <a href="js.jsp"style="text-decoration: none">借书</a>
        <a href="hs.jsp"style="text-decoration: none">还书</a>
        
        <a href="dlu.jsp"style="text-decoration: none">登录</a>
    </nav>
</div>
<aside class="shell">
    <h3>导航栏</h3>
    <a href="#d1"class="box"style="text-decoration: none"class="as">经典名著</a><br>
    <a href="#d2"class="box"style="text-decoration: none"class="as">外国经典</a><br>
    <a href="#d3"class="box"style="text-decoration: none"class="as">现代文学</a>
    <a href="#d4"class="box"style="text-decoration: none">名人传记</a></br>
    <a href="JSON.jsp">加载数据</a>
    </table>
</aside>
<div class="zt">
    <header class="bt">经典名著</header>
    <table border="0" class="books">
        <tr >
            <th><img src="bookimg/ddj.webp" class="books">
                <br><a class="bookname">道德经</a></th>
            <th><img src="bookimg/hlm.webp" class="books"><br><a class="bookname">红楼梦</a></th>
            <th ><img src="bookimg/sgyy.webp" class="books"> <br><a class="bookname">三国演义</a></th>
            <th><img src="bookimg/ly.webp" class="books"><a class="bookname">论语</a></th>
            <th><img src="bookimg/xyj.webp" class="books"><a class="bookname">西游记</a></th>
        </tr>
    </table>
    <header class="bt">外国经典</header>
    <table border="0" class="books">
        <tr >
            <th><img src="bookimg/ads.webp" class="books">
                <br><a class="bookname">奥德赛</a></th>
            <th><img src="bookimg/jejms.webp" class="books"><br><a class="bookname">吉尔伽美什</a></th>
            <th ><img src="bookimg/ja.webp" class="books"> <br><a class="bookname">简爱</a></th>
            <th><img src="bookimg/ysyy.webp" class="books"><a class="bookname">伊索寓言</a></th>
            <th><img src="bookimg/llyt.webp" class="books"><a class="bookname">伊利亚特</a></th>
        </tr>
    </table>
    <header class="bt">现代文学</header>
    <table border="0" class="books">
        <tr >
            <th><img src="bookimg/adjy.webp" class="books">
                <br><a class="bookname">爱的教育</a></th>
            <th><img src="bookimg/slzs.webp" class="books"><br><a class="bookname">死灵之书</a></th>
            <th ><img src="bookimg/st.webp" class="books"> <br><a class="bookname">三体</a></th>
            <th><img src="bookimg/xwz.webp" class="books"><a class="bookname">小王子</a></th>
            <th><img src="bookimg/zzq.webp" class="books"><a class="bookname">朱自清散文</a></th>
        </tr>
    </table>
    <header class="bt">名人传记</header>
    <table border="0" class="books">
        <tr >
            <th><img src="bookimg/mzdz.webp" class="books">
                <br><a class="bookname">毛泽东传</a></th>
            <th><img src="bookimg/jlfr.webp" class="books"><br><a class="bookname">居里夫人传</a></th>
            <th ><img src="bookimg/jyz.webp" class="books"> <br><a class="bookname">金庸传</a></th>
            <th><img src="bookimg/lkz.webp" class="books"><a class="bookname">林肯传</a></th>
            <th><img src="bookimg/llz.webp" class="books"><a class="bookname">列宁传</a></th>
        </tr>
    </table>
</div>
</body>
</html>