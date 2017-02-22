<%@ page import="model.User" %><%--
  Created by IntelliJ IDEA.
  User: Ирина
  Date: 22.02.2017
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>First app</title>
</head>
<body>
<h1>Spisok</h1>
<%--<%= request.getParameter("name") %>--%>
<%--<%= request.getAttribute("myParam") %>--%>
<%--<% String message = "empty msg";--%>
    <%--User user = (User) request.getAttribute("user");--%>
    <%--if (user.type == 3) {--%>
        <%--message = "new msg";--%>
    <%--}%>--%>
<%--<%= message %>--%>
<c:forEach items="${userlist}" var="userItem">
    <c:out value="${userItem.name}"></c:out>
    <c:out value="${userItem.type}"></c:out>
</c:forEach>
</body>
</html>
