<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <form action="${ctx}/new/query/title">
            <span style="font-size: 24px ">新闻标题</span><input type="text" name="title" value="${title}"><input type="submit" value="查询">
        </form>
    </div>


    <div>
        <table border="1">
            <thead>
            <tr><th colspan="6">
                <h2>新闻标题</h2>
            </th>
            </tr>
            <tr>
                <th>新闻编号</th>
                <th>新闻标题</th>
                <th>新闻摘要</th>
                <th>作者</th>
                <th>创建时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${news}" var="obj">
                <tr>
                    <td>${obj.id}</td>
                    <td>${obj.title}</td>
                    <td>${obj.summary}</td>
                    <td>${obj.author}</td>
                    <td>${obj.createDate}</td>
                    <td>
                        <%-- rest风格--%>
                        <a href="${ctx}/comments/query/newsid/${obj.id}">查看评论</a>
                        <a href="${ctx}/comments/addTo/${obj.id}">评论</a>
                        <a href="${ctx}/news/delete/${obj.id}">删除</a>
                    </td>


                </tr>

            </c:forEach>
            <tr>
                <td colspan="6">
                    <c:if test="${deleteFlag eq true}">
                        <span style="color: red">删除成功</span>
                    </c:if>
                    <c:if test="${deleteFlag eq false}">
                        <span style="color: yellow;">删除失败</span>
                    </c:if>
                </td>
            </tr>

            </tbody>
        </table>


    </div>


</div>


</body>
</html>
