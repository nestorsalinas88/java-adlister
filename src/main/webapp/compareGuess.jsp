<%--
  Created by IntelliJ IDEA.
  User: nestorsalinas
  Date: 6/4/18
  Time: 12:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${message}</h1>

<c:if test="${!message.equals('You WON!')}">
    <a href="/guessWho">Guess Again</a>
</c:if>


</body>
</html>
