<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="h-25"></div>
        <form action="<c:url value = "/login"/>" method="post">
            <div class="form-group">
                <label for="inputEmail1">Email </label>
                <input type="email" name="email" class="form-control" id="inputEmail1" aria-describedby="emailHelp" placeholder="Nhập email" required>
            </div>
            <div class="form-group">
                <label for="inputPassword1">Password</label>
                <input type="password" name="password" class="form-control" id="inputPassword1" placeholder="Nhập mật khẩu" required>
            </div>
            <button type="submit" class="btn btn-primary">Đăng nhập</button>
        </form>
    </div>



</body>
</html>
