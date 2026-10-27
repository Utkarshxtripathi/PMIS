public abstract class Vehicle implements Rentable {
    private final String id;
    private final String model;
    private final double dailyRate;
    private boolean available = true;

    protected Vehicle(String id, String model, double dailyRate) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Vehicle id cannot be empty.");
        }
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Vehicle model cannot be empty.");
        }
        if (dailyRate < 0) {
            throw new IllegalArgumentException("Daily rate cannot be negative.");
        }

        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    void markRented() {
        available = false;
    }

    void markAvailable() {
        available = true;
    }

    protected void validateDays(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Rental days must be greater than zero.");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + model + " (" + id + ")";
    }
}
