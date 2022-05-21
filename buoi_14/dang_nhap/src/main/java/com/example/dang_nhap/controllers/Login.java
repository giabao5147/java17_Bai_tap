package com.example.dang_nhap.controllers;

import com.example.dang_nhap.dao.UserDao;
import com.example.dang_nhap.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/views/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        //Kiem tra dang nhap
        User user = userDao.getUser(email, password);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            request.setAttribute("user", user);
            request.getRequestDispatcher("views/success-login.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/views/login.jsp");
        }
    }
}
