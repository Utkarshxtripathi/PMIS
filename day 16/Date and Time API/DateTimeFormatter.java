import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println("Formatted date and time: " + formattedDateTime);

        LocalDateTime parsedDateTime =
                LocalDateTime.parse("25-12-2026 14:30:00", formatter);
        System.out.println("Parsed date and time: " + parsedDateTime);
    }
}
