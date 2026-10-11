package ProblemSet2;

class Vehicle {

    protected String registrationNumber;

    // Constructor
    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    // Base toll
    public double calculateToll() {
        return 50.0;
    }

    // Getter
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

// Car class
class Car extends Vehicle {

    public Car(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public double calculateToll() {
        return 50.0 + 20.0;
    }
}

// Truck class
class Truck extends Vehicle {

    private int axles;

    public Truck(String registrationNumber, int axles) {

        super(registrationNumber);

        this.axles = axles;
    }

    @Override
    public double calculateToll() {

        return 100.0 + (axles * 50.0);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Parent reference holding Car object
        Vehicle myCar = new Car("MH-04-AB-1234");

        // Parent reference holding Truck object
        Vehicle myTruck = new Truck("MH-43-XY-9999", 4);

        System.out.println(
            "Vehicle: " + myCar.getRegistrationNumber() +
            " | Toll Due: ₹" + myCar.calculateToll()
        );

        System.out.println(
            "Vehicle: " + myTruck.getRegistrationNumber() +
            " | Toll Due: ₹" + myTruck.calculateToll()
        );
    }
}