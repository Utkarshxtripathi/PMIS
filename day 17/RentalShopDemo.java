public class RentalShopDemo {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();
        shop.addVehicle(new Car("C1", "Swift", 2000.0));
        shop.addVehicle(new Bike("B1", "Activa", 400.0));
        shop.addVehicle(new Truck("T1", "Tata Ace", 2500.0));

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        System.out.println(shop.rent("B1", asha, 8));
        System.out.println(shop.rent("T1", ravi, 2));

        try {
            shop.rent("B1", ravi, 2);
        } catch (IllegalStateException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        shop.giveBack("B1");
        shop.showAvailable();
    }
}
