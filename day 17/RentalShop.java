import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class RentalShop {
    private final Map<String, Vehicle> fleet = new LinkedHashMap<>();

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null.");
        }
        if (fleet.containsKey(vehicle.getId())) {
            throw new IllegalArgumentException("A vehicle with id " + vehicle.getId() + " already exists.");
        }
        fleet.put(vehicle.getId(), vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days) {
        Vehicle vehicle = fleet.get(vehicleId);
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle " + vehicleId + " was not found.");
        }
        if (!vehicle.isAvailable()) {
            throw new IllegalStateException(vehicle + " is already rented");
        }
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }

        Rental rental = new Rental(vehicle, customer, days);
        vehicle.markRented();
        customer.addRental(rental);
        return rental;
    }

    public void giveBack(String vehicleId) {
        Vehicle vehicle = fleet.get(vehicleId);
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle " + vehicleId + " was not found.");
        }
        if (vehicle.isAvailable()) {
            throw new IllegalStateException(vehicle + " is not currently rented");
        }
        vehicle.markAvailable();
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");
        for (Vehicle vehicle : fleet.values()) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle);
            }
        }
    }

    public Collection<Vehicle> getFleet() {
        return java.util.Collections.unmodifiableCollection(fleet.values());
    }
}
