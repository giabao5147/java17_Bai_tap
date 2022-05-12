package com.example.doan_so.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Xoa session va cookie
        HttpSession session = request.getSession();
        Cookie cookie = new Cookie("username", "");
        session.invalidate();
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        response.sendRedirect("login.jsp");
    }

}
