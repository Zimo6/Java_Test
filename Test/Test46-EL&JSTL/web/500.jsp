<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/7
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>500</title>
</head>
<body>
<h1>服务器正忙。。。</h1>
<%
    String message = exception.getMessage();
    out.print(message);
%>
</body>
</html>
