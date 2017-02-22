<%--
  Created by IntelliJ IDEA.
  User: Ирина
  Date: 22.02.2017
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Students app</title>
</head>
<body>
<h1>Spisok students</h1>
<table border="1 ">
<tr>
    <td>ID</td>
    <td>Name</td>
    <td>Age</td>
    <td>ID_group</td>
</tr>

    <c:forEach items="${studentList}" var="studItem">
    <tr>
        <td><c:out value="${studItem.id}"></c:out></td>
        <td><c:out value="${studItem.name}"></c:out></td>
        <td><c:out value="${studItem.age}"></c:out></td>
        <td><c:out value="${studItem.id_group}"></c:out></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
