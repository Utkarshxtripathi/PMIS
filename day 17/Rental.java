import java.util.Locale;

public class Rental {
    private final Vehicle vehicle;
    private final Customer customer;
    private final int days;
    private final double totalCost;

    Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalCost = vehicle.calculateRent(days);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "%s rented %s for %d days = %.2f",
                customer.getName(), vehicle, days, totalCost);
    }
}
