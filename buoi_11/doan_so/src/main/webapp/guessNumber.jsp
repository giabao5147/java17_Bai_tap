<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%
    //Kiem tra nguoi dung da nhap user name
    boolean isLogin = false;
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("username")) {
            isLogin = true;
        }
    }
    if (!isLogin) {
        response.sendRedirect("login.jsp");
    }
%>
<html>
<head>
    <title>Trang doan so</title>
    <link rel="stylesheet" href="styles/bootstrap.min.css">
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>

<div class="container-fluid">
    <div class="row block-1">
        <div class="col-md-12">
        </div>
    </div>

    <div class="row block-2">
        <div class="col-md-12">
            <div class="row block-2-row">
                <div class="col-md-2 block-2-1">
                </div>
                <div class="col-md-8 block-2-2">
                    <div class="form-group">
                        <form action="guessNumber" method="post">
                            <a class="btn btn-primary" href="<c:url value = "rank"/>" role="button">Xếp hạng</a>
                            <a class="btn btn-primary" href="<c:url value = "logout"/>" role="button">Log out</a> <br> <br>
                            <label> Đoán một số </label> <br>
                            <input type="text" name="guessNumber" required> <br> <br>
                            <button type="submit" class="btn btn-primary" value="submit">Submit</button> <br>
                        </form>
                            <h4> ${status} </h4>
                    </div>

                </div>
                <div class="col-md-2 block-2-1">
                </div>
            </div>
        </div>
    </div>

    <div class="row block-1">
        <div class="col-md-12">
        </div>
    </div>
</div>

</body>
</html>
