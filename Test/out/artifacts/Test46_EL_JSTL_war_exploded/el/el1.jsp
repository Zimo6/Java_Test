<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>el1</title>
    <%--* 功能：用于判断字符串、集合、数组对象是否为null或者长度是否为0--%>
    <%--
                        1. pageScope		--> pageContext
                        2. requestScope 	--> request
                        3. sessionScope 	--> session
                        4. applicationScope --> application（ServletContext）

    --%>
    <%--
    四大域对象作用范围：

    pageContext  <  httpServletRequest  <  httpSession   < servletContext

    --%>
</head>
<body>
<%--isELIgnored="true" EL表达式字符串显示--%>
 ${3>4}
\${3>4}<%--转义--%>

<hr>

<h3>算数运输符</h3>
${3 + 4}<br>
${3 / 4}<br>
${3 div 4}<br>
${3 % 4}<br>
${3 mod 4}<br>
<h3>比较运算符</h3>
${3 == 4}<br>

<h3>逻辑运算符</h3>
${3 > 4  && 3 < 4}<br>
${3 > 4  and 3 < 4}<br>


<h4>empty运算符</h4>
<%--
* ${empty list}:判断字符串、集合、数组对象是否为null或者长度为0   为空返回true
* ${not empty str}:表示判断字符串、集合、数组对象是否不为null 并且 长度>0
--%>
<%
    String str = "";
    request.setAttribute("str",str);
%>
${requestScope.str}

</body>
</html>
