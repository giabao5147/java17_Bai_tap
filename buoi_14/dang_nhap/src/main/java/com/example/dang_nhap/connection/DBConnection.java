package com.example.dang_nhap.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final static String URL = "jdbc:mysql://localhost:3307/buoi_14";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "admin";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Khong tim thay driver");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Khong tim thay db");
            e.printStackTrace();
        }
        return null;
    }
}
