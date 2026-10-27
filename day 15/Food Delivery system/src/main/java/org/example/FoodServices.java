package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodServices {

    public void addFoodItemToRestaurant(int restaurantId, FoodItem foodItem) {
        String query = "INSERT INTO food_items (id, name, price, restaurant_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, foodItem.getId());
            pstmt.setString(2, foodItem.getName());
            pstmt.setDouble(3, foodItem.getPrice());
            pstmt.setInt(4, restaurantId);
            pstmt.executeUpdate();
            System.out.println("Food item saved to database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
        String query = "DELETE FROM food_items WHERE id = ? AND restaurant_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, foodItemId);
            pstmt.setInt(2, restaurantId);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Food item removed successfully!");
            } else {
                System.out.println("Item not found for this restaurant.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<FoodItem> getAllFoodItems() {
        List<FoodItem> foodItems = new ArrayList<>();
        String query = "SELECT id, name, price FROM food_items";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                FoodItem item = new FoodItem(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price")
                );
                foodItems.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodItems;
    }
}