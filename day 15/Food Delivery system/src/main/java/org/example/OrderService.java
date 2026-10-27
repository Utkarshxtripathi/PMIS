package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class OrderService {

    // 1. Add delivery person
    public void addDeliveryPerson(int id, String name, long contactNo) {
        String query = "INSERT INTO delivery_persons (delivery_person_id, name, contact_no) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setLong(3, contactNo);
            pstmt.executeUpdate();
            System.out.println("Delivery person added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 2. Place an order and insert items
    public void placeOrder(int orderId, int customerId, Map<Integer, Integer> cartItems) {
        String orderQuery = "INSERT INTO orders (order_id, customer_id, status) VALUES (?, ?, 'Pending')";
        String itemQuery = "INSERT INTO order_items (order_id, food_item_id, quantity) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false); // Transaction to ensure order and items save together

            try (PreparedStatement orderPstmt = conn.prepareStatement(orderQuery);
                 PreparedStatement itemPstmt = conn.prepareStatement(itemQuery)) {

                // Save order header
                orderPstmt.setInt(1, orderId);
                orderPstmt.setInt(2, customerId);
                orderPstmt.executeUpdate();

                // Save individual items
                for (Map.Entry<Integer, Integer> entry : cartItems.entrySet()) {
                    itemPstmt.setInt(1, orderId);
                    itemPstmt.setInt(2, entry.getKey());
                    itemPstmt.setInt(3, entry.getValue());
                    itemPstmt.addBatch();
                }
                itemPstmt.executeBatch();

                conn.commit();
                System.out.println("Order placed successfully! Your order ID is: " + orderId);
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 3. Assign delivery person to order
    public void assignDeliveryPersonToOrder(int orderId, int deliveryPersonId) {
        String query = "UPDATE orders SET delivery_person_id = ? WHERE order_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, deliveryPersonId);
            pstmt.setInt(2, orderId);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Delivery person assigned to order successfully!");
            } else {
                System.out.println("Order ID not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}