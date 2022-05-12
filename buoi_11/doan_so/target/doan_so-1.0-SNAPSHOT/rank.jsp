<%@ page import="java.util.Collections" %>
<%@ page import="com.example.doan_so.model.Player" %>
<%@ page import="com.example.doan_so.model.PlayerList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Comparator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%
    //Sap xep theo so luot doan tang dan
    if (request.getAttribute("playerList") != null) {
        PlayerList playerList = (PlayerList)request.getAttribute("playerList");
        List<Player> list = playerList.getList();
        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                if (player1.getNumberOfGuesses() > player2.getNumberOfGuesses()) {
                    return 1;
                } else if (player1.getNumberOfGuesses() < player2.getNumberOfGuesses()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        request.setAttribute("playerList", new PlayerList(list));
    }
%>
<html>
<head>
    <title>Bang xep hang</title>
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
                    <br>
                    <a class="btn btn-primary" href="<c:url value = "guessNumber"/>" role="button">Đoán số</a>
                    <a class="btn btn-primary" href="<c:url value = "logout"/>" role="button">Log out</a> <br> <br>
                    <table class="table">
                        <tr>
                            <th scope="col">Tên người chơi</th>
                            <th scope="col">Số lần đoán</th>
                        </tr>
                        <c:forEach var = "player" items = "${playerList.getList()}">
                            <tr>
                                <td>${player.getUserName()}</td>
                                <td>${player.getNumberOfGuesses()}</td>
                            </tr>
                        </c:forEach>
                    </table>

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
