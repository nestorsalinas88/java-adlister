<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/style.jsp">
        <jsp:param name="title" value="Viewing All The dao.Ads" />
    </jsp:include>
</head>
<body style="background-color: papayawhip">
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container-fluid">

    <h1 class="text-center mt-5" style="font-family: 'BioRhyme Expanded', serif;">Welcome to Nestor's List!</h1>
    <div class="row mt-5">
    <c:forEach var="ad" items="${ads}">
            <div class="mb-2 col-sm-4 text-center">
                <div class="card" style="background-color: aqua">
                    <div class="card-body">
                        <h3 class="card-title " style="font-family: 'Jua', sans-serif" >${ad.title}</h3>
                        <p class="card-text head">${ad.description}</p>
                        <p class="card-text head">${ad.category}</p>
                        <a href="#" class="btn btn-primary">Link</a>
                    </div>
                </div>
            </div>
    </c:forEach>
    </div>






</div>
<%@ include file="/WEB-INF/partials/script.jsp"%>

</body>
</html>
