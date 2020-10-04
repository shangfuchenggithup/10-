<%--
  Created by IntelliJ IDEA.
  User: dell pc
  Date: 2020/10/1
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dotinajia" method="post">
    <p>会议室
        <input type="text" name="meetingName"/>
    </p>
    <p>申请人<input type="text" name="advanceName"/></p>
    <p>预定日期<input type="text" name="meetingOrder"/>日期格式yyyy-MM-dd</p>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
