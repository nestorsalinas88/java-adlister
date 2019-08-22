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

    action = (request.getParameter("username").equalsIgnoreCase("admin"));
    action = (request.getParameter("password") != null && request.getParameter("password").equals("pass123"));

    if (action) {
        response.sendRedirect("profile.jsp");
    }

%>


<%--<%--%>
    <%--if (request.getMethod().equalsIgnoreCase("post")) {--%>

    <%--String email = request.getParameter("email");--%>
    <%--String pass = request.getParameter("password");--%>

    <%--if (email.equalsIgnoreCase("admin@gmail.com") && pass.equals("PassWord")) {--%>
        <%--response.sendRedirect("profile.jsp");--%>
    <%--}--%>
<%--}--%>

<%--%>--%>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
</head>
<body>
<%--

This form should submit a POST request to /login.jsp
Inside of login.jsp write some code to check the submmitted values.
If the username submitted is "admin", and the password is "password",
redirect the user to the profile page, otherwise, redirect back to the login form.

--%>
<div class="jumbotron jumbotron-fluid" style="margin-top: 15%" >

    <form action="/sample" method="post" class="mx-auto" style="width: 50%;">
        <div class="col-sm-10">
            <label for="exampleInputEmail1">Email address</label>
            <input name="username" type="email" class="form-control" id="exampleInputEmail1"
                   aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="col-sm-10">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" name="password" class="form-control" id="exampleInputPassword1"
                   placeholder="Password">
        </div>
        <div class="mx-auto" style="width: 200px; padding: 20px;">
        <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
        integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
        integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
        crossorigin="anonymous"></script>
</body>
</html>
