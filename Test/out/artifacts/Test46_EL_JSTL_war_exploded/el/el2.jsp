<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/7
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL获取域中数据</title>
</head>
<body>
<%
    //在域中存储数据
    session.setAttribute("name","李四");

    request.setAttribute("name","张三");

    session.setAttribute("age","23");

    request.getSession().setAttribute("age","30");

    request.setAttribute("str","");

%>

<h3>el获取值</h3>
${requestScope.name}
${sessionScope.age}
${sessionScope.haha}

${name}<%--从域对象小到大范围查找，找到第一个--%>
${sessionScope.name}
</body>
</html>
