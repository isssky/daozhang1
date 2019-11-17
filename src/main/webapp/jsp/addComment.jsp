<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2019/11/11
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/comments/add" method="post">
    <input type="hidden" name="newsDetail.id" value="${newsId}">
    <table border="1">
        <thead>
        <tr>
            <th style="background-color: darkcyan;" colspan="2">增加评论</th>
        </tr>

        </thead>

        <tr>
        <tbody>
            <td>评论内容(*)</td>
            <td>
                <textarea name="content" rows="10" cols="40">

                </textarea>
            </td>
        </tr>
        <tr>
            <td>评论人</td>
            <td>
                <input type="text" name="author">
            </td>

        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">    <a href="javascript:history.go(-1)">返回</a>
            </td>
        </tr>

        </tbody>
    </table>

</form>


</body>
</html>
