package com.example.todotask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    public static Connection connect() throws SQLException {
        // Replace these with your actual database connection details
        String url = "jdbc:mysql://localhost:3306/todotask";
        String user = "root";
        String password = "password";

        return DriverManager.getConnection(url, user, password);
    }
}

