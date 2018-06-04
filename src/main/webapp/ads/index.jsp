<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nestorsalinas
  Date: 6/4/18
  Time: 12:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="../partials/head.jsp"%>
</head>
<body>
<%@ include file="../partials/navbar.jsp"%>

<div class="container">
    <h1>View all</h1>

    <c:forEach var="ad" items="${ads}">
        <h1>${ad.title}</h1>
        <p>${ad.description}</p>
    </c:forEach>
</div>
</body>
</html>
