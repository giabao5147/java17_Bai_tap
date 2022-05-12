package com.example.doan_so.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Luu thong tin username vao cookie
        String userName = request.getParameter("userName");
        Cookie cookie = new Cookie("username", userName);
        cookie.setMaxAge(60*15);
        response.addCookie(cookie);
        response.sendRedirect("guessNumber.jsp");
    }
}
