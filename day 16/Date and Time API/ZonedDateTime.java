import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime localDateTime = ZonedDateTime.now();
        ZonedDateTime newYorkDateTime =
                ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Current date and time with zone: " + localDateTime);
        System.out.println("Date and time in New York: " + newYorkDateTime);
    }
}
