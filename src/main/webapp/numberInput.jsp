<%--
  Created by IntelliJ IDEA.
  User: nestorsalinas
  Date: 6/3/18
  Time: 6:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculate dude</h1>

<form action="/calculator" method="post">
    <input type="text" name="x" placeholder="enter a number"><br>
    <input type="text" name="y" placeholder="enter some other number"><br>
    <input type="radio" name="op" value="+">Add
    <input type="radio" name="op" value="*">Multiply <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
