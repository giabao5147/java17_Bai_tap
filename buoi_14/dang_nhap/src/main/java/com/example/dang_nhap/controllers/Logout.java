package com.example.dang_nhap.controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect(request.getContextPath() + "/views/login.jsp");
    }
}
