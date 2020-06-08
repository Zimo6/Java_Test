<%@ page import="domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/7
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL_获取数据</title>
</head>
<body>
<%
    User user = new User();
    user.setName("崔双麒");
    user.setAge(20);
    user.setBirthday(new Date());
    request.setAttribute("u",user);

    List list = new ArrayList();
    list.add("aaaa");
    list.add("bbbb");
    list.add(user);
    request.setAttribute("list",list);

    Map map = new HashMap();
    map.put("sname","崔某");
    map.put("sgender","男");
    map.put("user",user);
    request.setAttribute("map",map);
%>
<%--
    * 通过的是对象的属性来获取
        * setter或getter方法，去掉set或get，在将剩余部分，首字母变为小写。
        * setName --> Name --> name
--%>
<h3>EL表达式获取对象的值</h3>
${requestScope.u.name}<br>
${requestScope.u.age}<br>
${u.birthday.year}<br>
${u.birStr}

<h3>EL表达式获取List集合的值</h3>
${list}<br>
${requestScope.list.get(0)}<br>
${list[1]}<br>
${list[2].name}<br>
${list.get(2).name}<br>
<%--${list.get(2)}<br> 报错--%>

<h3>EL表达式获取Map的值</h3>
${map.sname}<br>
${map["sname"]}<br>

${map.sgender}<br>

${map.user.name}<br>
</body>
</html>
