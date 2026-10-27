import java.time.LocalTime;

class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime customTime = LocalTime.of(14, 30, 15);

        System.out.println("Current time: " + now);
        System.out.println("Custom time: " + customTime);
        System.out.println("One hour later: " + now.plusHours(1));
        System.out.println("One minute earlier: " + now.minusMinutes(1));
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
    }
}
