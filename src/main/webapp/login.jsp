<%--
  Created by IntelliJ IDEA.
  User: nestorsalinas
  Date: 5/31/18
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! boolean action = true; %>
<%
    action = (request.getParameter("username") != null && request.getParameter("username").equals("admin"));
    action = (request.getParameter("password") != null && request.getParameter("password").equals("pass123"));

    if(action){
        response.sendRedirect("profile.jsp");
    }

%>

<html>
    <head>

    </head>
<body>
    <form action="/sample" method="post">
        <h1>Username:</h1>
        <input type="text" name="username">
        <br>
        <h1>Password:</h1>
        <input type="password" name="password">
        <br>
        <button class="btn-primary">Submit</button>
    </form>

    <p></p>


<%--

This form should submit a POST request to /login.jsp
Inside of login.jsp write some code to check the submmitted values.
If the username submitted is "admin", and the password is "password",
redirect the user to the profile page, otherwise, redirect back to the login form.

--%>

</body>
</html>
