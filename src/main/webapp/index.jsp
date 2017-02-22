<%--
  Created by IntelliJ IDEA.
  User: Ирина
  Date: 22.02.2017
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First app</title>
</head>
<body>
<h1>First app - index</h1>
<div>
    <a href="/list">Open list</a>
</div>
<div>
    <form action="/" method="post">
        <label for="input">Label:</label>
        <input type="text" name="input" id="input" value="">
        <input type="submit" value="Sumbit" >
    </form>
</div>
</body>
</html>
