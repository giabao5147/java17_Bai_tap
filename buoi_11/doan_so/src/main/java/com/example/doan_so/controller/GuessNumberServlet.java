package com.example.doan_so.controller;

import com.example.doan_so.model.Player;
import com.example.doan_so.model.PlayerList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/guessNumber"})
public class GuessNumberServlet extends HttpServlet {

    public static final int MIN = 1;
    public static final int MAX = 1000;
    public static PlayerList playerList;

    @Override
    public void init() throws ServletException {
        playerList = new PlayerList();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("guessNumber.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int randomNumber;
        int numberOfGuesses;
        String status = "";
        RequestDispatcher dispatcher;
        HttpSession session = request.getSession();
        request.setAttribute("status", status);
        //Tao so ngau nhien va bien dem cho session
        if (session.getAttribute("randomNumber") == null) {
            randomNumber = randomNumber(MIN, MAX);
            numberOfGuesses = 0;
            session.setAttribute("randomNumber", randomNumber);
            session.setAttribute("numberOfGuesses", numberOfGuesses);
        } else {
            randomNumber = (int)session.getAttribute("randomNumber");
            numberOfGuesses = (int)session.getAttribute("numberOfGuesses");
        }
        //Kiem tra so nhap vao va tang bien dem
        if (isValidInput(request.getParameter("guessNumber"))) {
            numberOfGuesses += 1;
            session.setAttribute("numberOfGuesses", numberOfGuesses);
            int guessNumber = Integer.parseInt(request.getParameter("guessNumber"));
            if (guessNumber > randomNumber) {
                status = "Số vừa đoán lớn hơn đáp án";
            } else if (guessNumber < randomNumber) {
                status = "Số vừa đoán nhỏ hơn đáp án";
            } else {
                //Doan dung, ghi nhan so lan doan va reset du lieu
                status = "Bạn đã đoán đúng";
                playerList.addPlayer(new Player(getUserName(request), (int)session.getAttribute("numberOfGuesses")));
                session.setAttribute("randomNumber", null);
            }
        } else {
            //Khong dung dinh dang so
            status = "Không đúng định dạng số";
        }
        //Tra ve trang doan so kem thong bao
        request.setAttribute("status", status);
        dispatcher = request.getRequestDispatcher("guessNumber.jsp");
        dispatcher.forward(request, response);
    }
    //Tao so ngau nhien
    public int randomNumber(int min, int max) {
        return (int)(Math.random() * max + min);
    }
    //Kiem tra du lieu nhap vao
    public boolean isValidInput(String input) {
        return input.matches("\\d+");
    }
    //Lay user name tu coookie
    public String getUserName(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                return cookie.getValue();
            }
        }
        return null;
    }
}
