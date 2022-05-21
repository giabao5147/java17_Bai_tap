package com.example.dang_nhap.controllers;

import com.example.dang_nhap.models.User;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/login"})
public class AuthFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("user");

        if (user != null) {
            res.sendRedirect(req.getContextPath() + "/views/success-login.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }
}
