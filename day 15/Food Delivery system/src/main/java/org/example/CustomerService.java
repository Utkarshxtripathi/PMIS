package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerService {

    // Add a customer to MySQL
    public void addCustomer(int userId, String username, long contactNo) {
        String query = "INSERT INTO users (user_id, username, contact_no) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, username);
            pstmt.setLong(3, contactNo);
            pstmt.executeUpdate();
            System.out.println("Customer created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieve a customer by ID
    public boolean customerExists(int userId) {
        String query = "SELECT user_id FROM users WHERE user_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, userId);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}