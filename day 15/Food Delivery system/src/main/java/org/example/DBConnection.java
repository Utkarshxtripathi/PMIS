package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/Food_Delivery_system?user=root";
    private static final String USER = "root"; // your mysql username
    private static final String PASSWORD = "Utkarsh@321321"; // your mysql password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}