<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="h-25"></div>
        <div>
            <div class="jumbotron">
                <h2 class="text-center">Thông tin người dùng</h2>
                <p class="h4">
                    ID: ${user.id} <br>
                    Email: ${user.email} <br>
                    Password: ${user.password} <br>
                </p>
                <a class="btn btn-primary text-center" href="<c:url value = "/logout"/>">Đăng xuất</a>
            </div>
        </div>
    </div>
</body>
</html>
