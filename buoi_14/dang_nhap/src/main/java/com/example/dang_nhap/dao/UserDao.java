package com.example.dang_nhap.dao;

import com.example.dang_nhap.connection.DBConnection;
import com.example.dang_nhap.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    private Connection connection = null;
    private PreparedStatement statement = null;
    private ResultSet result = null;

    public User getUser(String email, String password) {
        User user =  null;
        String sql = "SELECT * FROM Users WHERE email = ? AND password = ?";
        try {
            connection = DBConnection.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            result = statement.executeQuery();
            while (result.next()) {
                user = new User(result.getInt(1), result.getString(2), result.getString(3));
            }
            connection.close();
        } catch (Exception e) {

        }
        return user;
    }
}
