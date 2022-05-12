package com.example.doan_so.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/rank")
public class RankServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher;

        request.setAttribute("playerList", GuessNumberServlet.playerList);
        dispatcher = request.getRequestDispatcher("rank.jsp");
        dispatcher.forward(request, response);
    }
}
