import java.time.LocalDateTime;

class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime customDateTime = LocalDateTime.of(2026, 12, 25, 14, 30);

        System.out.println("Current date and time: " + now);
        System.out.println("Custom date and time: " + customDateTime);
        System.out.println("Tomorrow at this time: " + now.plusDays(1));
        System.out.println("One year earlier: " + now.minusYears(1));
    }
}
