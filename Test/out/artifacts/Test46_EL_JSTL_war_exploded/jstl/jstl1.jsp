<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%--导入两个两个jar包，jstl标签库  大名鼎鼎的C标签  --%>
    <title>if标签</title>
</head>
<body>
    <%--
    c:if标签
        1.属性
            test 必须属性，接收boolean表达式
                如果表达式为true，则显示标签体内容（一般结合el表达式）
    --%>
    <c:if test="true">
        <h1>我是真的、、</h1>
    </c:if>

    <%
        //判断request域中一个list集合是否为空，如果不为空则遍历集合
        List list = new ArrayList();
        list.add("aaa");
        request.setAttribute("list",list);

        request.setAttribute("number",3);
    %>
    <c:if test="${not empty list}">
        遍历集合。。。
    </c:if>
<br>
    <c:if test="${number % 2 != 0}">
        ${number}为奇数
    </c:if>

</body>
</html>
