package Oops;

class Vehicle {

    String brand;

    void startEngine() {
        System.out.println(brand + " engine started.");
    }
}

class Bike extends Vehicle {

    boolean hasCarrier;

    void kickStand() {
        System.out.println("Kickstand put down.");
    }
}

public class inheritance {

    public static void main(String[] args) {

        Bike myBike = new Bike();

        myBike.brand = "shine";

        myBike.startEngine();

        myBike.kickStand();
    }
}