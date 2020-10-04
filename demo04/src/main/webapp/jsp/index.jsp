<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/9/27
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table border="1px">
        <tr>
            <td>预定编号</td>
            <td>会议室</td>
            <td>预定人</td>
            <td>日期</td>
        </tr>
        <c:forEach items="${pageInfo}" var="list">
            <tr>
                <td>${list.id}</td>
                <td>${list.meetingName}</td>
                <td>${list.advanceName}</td>
                <td><fmt:formatDate pattern="yyyy-MM-dd" value="${list.meetingOrder}" type="both"/></td>
            </tr>
        </c:forEach>
    </table>
    <form action="/tianjia">
        <input type="submit" value="添加成员"/>
    </form>
</center>
</body>
</html>
