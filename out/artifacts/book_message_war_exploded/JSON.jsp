<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.0.js">
    </script>
</head>
<body>
<button id="btn">加载数据</button></br>
<table id="dataTable" border="1" cellpadding="0" cellspacing="0">
    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>类型</th>
    </tr>
</table>
<a href="library.jsp">返回界面</a>
</body>
<script type="text/javascript">
    $(document).ready(function () {

        $("#btn").click(function() {
            $.getJSON('http://localhost:8080/book_message/JSONServlet',
                function(data) {
                    var html = '';
                    for (var books in data) {
                        html += '<tr>';
                        for (var key in data[books]) {
                            html += '<td>' + data[books][key] + '</td>';
                        }
                        html += '</tr>';

                    }
                    $('#dataTable').append(html);
                });
        //     alert("add");
        });


    });
</script>
</html>
