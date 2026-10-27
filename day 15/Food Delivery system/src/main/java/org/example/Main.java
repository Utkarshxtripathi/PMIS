package org.example;

public class Main {
    public static void main(String[] args) {
        FoodServices foodServices = new FoodServices();

        // Create a food item and insert into MySQL (e.g., restaurant ID 101)
        FoodItem item = new FoodItem(1, "Panjabi Thali", 340.0);
        foodServices.addFoodItemToRestaurant(101, item);

        // Fetch and print items
        System.out.println("Food items in DB: " + foodServices.getAllFoodItems());
    }
}