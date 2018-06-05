<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>Enter your info!</h1>
        <form action="/register" method="post">
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" class="form-control">
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="text" id="email" name="email" class="form-control">
            </div>
            <div class="form-group">
                <label for="password">Email</label>
                <input type="password" id="password" name="password" class="form-control">
            </div>
            <div class="form-group">
                <label for="confirm_password">Email</label>
                <input type="password" id="confirm_password" name="confirm_password" class="form-control">
            </div>
            <input type="submit" class="btn btn-primary btn-block">
        </form>

    </div>
</body>
</html>
