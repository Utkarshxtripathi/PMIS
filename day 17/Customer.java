import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Rental> rentalHistory = new ArrayList<>();

    public Customer(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentalHistory() {
        return Collections.unmodifiableList(rentalHistory);
    }

    void addRental(Rental rental) {
        rentalHistory.add(rental);
    }
}
