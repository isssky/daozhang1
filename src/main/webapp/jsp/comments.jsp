<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table tbody tr:nth-of-type(2n+1) {
            background-color: green;
        }
        #main {
            width: 1190px;
            margin: auto;
        }
        table{
            width: 1190px;

        }
    </style>
</head>
<body>

<div id="main">




    <div>
        <table border="1">
            <thead>
            <tr><th colspan="4">
                <h2>评论列表<a href="/">返回新闻列表</a></h2>
            </th>
            </tr>
            <tr>
                <th>评论编号</th>
                <th>评论内容</th>
                <th>评论人</th>
                <th>评论时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${comments}" var="obj">
                <tr>
                    <td>${obj.id}</td>
                    <td>${obj.content}</td>
                    <td>${obj.author}</td>
                    <td><fmt:formatDate value="${obj.createDate}" pattern="yyyy-mm-dd HH:MM:SS"  /></td>
                </tr>

            </c:forEach>


            </tbody>
        </table>

    </div>


</div>


</body>
</html>
