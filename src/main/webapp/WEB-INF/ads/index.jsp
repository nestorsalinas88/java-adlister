<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User.User: nestorsalinas
  Date: 6/4/18
  Time: 12:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/WEB-INF/partials/head.jsp"%>
</head>
<body>
<%@ include file="/WEB-INF/partials/navbar.jsp"%>

    <h1 class="text-center container">View all</h1>
<div class="row mt-5">
    <div class = "container-fluid d-flex flex-wrap">

<c:forEach var="ad" items="${ads}">
    <div class="container-fluid d-flex flex-wrap">
                <h5 >${ad.title}</h5>
                <p >${ad.description}</p>
                <a href="/ads" class="btn btn-primary col-4">view more</a>
    </div>
</c:forEach>
    </div>
</div>
</body>
</html>
