<%--
  Created by IntelliJ IDEA.
  User: nestorsalinas
  Date: 6/4/18
  Time: 12:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/guessWho" method="post">
    <label for="guess">Guess a number</label>
    <input id="guess" type="text" name="guess" placeholder="guess number">
    <input type="submit" value="submit">

</form>
</body>
</html>
