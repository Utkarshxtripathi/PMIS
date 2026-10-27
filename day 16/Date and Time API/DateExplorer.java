import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class DateExplorer {
    private final Scanner scanner;
    private final LocalDate date;

    public DateExplorer(Scanner scanner, LocalDate date) {
        this.scanner = scanner;
        this.date = date;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(input);
            new DateExplorer(scanner, date).run();
        } catch (DateTimeException exception) {
            System.out.println("Invalid date. Please use the yyyy-MM-dd format.");
        }
    }

    private void run() {
        int choice;
        do {
            displayMenu();
            choice = readInteger("Choose an option: ");

            switch (choice) {
                case 1:
                    displayMonth();
                    break;
                case 2:
                    displayYear();
                    break;
                case 3:
                    displayDayOfWeek();
                    break;
                case 4:
                    displayLeapYearStatus();
                    break;
                case 5:
                    lookBackMonths();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please choose an option from 1 to 6.");
            }
        } while (choice != 6);
    }

    private void displayMenu() {
        System.out.println("\nExplore " + date + ":");
        System.out.println("1. Display month");
        System.out.println("2. Display year");
        System.out.println("3. Display day of week");
        System.out.println("4. Check whether the year is a leap year");
        System.out.println("5. Look back by a number of months");
        System.out.println("6. Exit");
    }

    public void displayMonth() {
        System.out.println("Month: " + date.getMonth());
    }

    public void displayYear() {
        System.out.println("Year: " + date.getYear());
    }

    private void displayDayOfWeek() {
        System.out.println("Day of week: " + date.getDayOfWeek());
    }

    private void displayLeapYearStatus() {
        if (date.isLeapYear()) {
            System.out.println(date.getYear() + " is a leap year.");
        } else {
            System.out.println(date.getYear() + " is not a leap year.");
        }
    }

    public void lookBackMonths() {
        int months;
        do {
            months = readInteger("How many months would you like to look back? ");
            if (months < 0) {
                System.out.println("Enter zero or a positive number of months.");
            }
        } while (months < 0);

        System.out.println(months + " month(s) before " + date + ": "
                + date.minusMonths(months));
    }

    private int readInteger(String prompt) {}
}
