// Demonstrating race conditions and inconsistent state without synchronization
class Railway {
    int seats = 2;

    void bookTicket(int requestedSeats) {
        System.out.println(
            Thread.currentThread().getName() + " is booking tickets"
        );

        if (seats >= requestedSeats) {
            try {
                Thread.sleep(100); // Artificial delay to simulate processing and trigger race condition
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            seats = seats - requestedSeats;

            System.out.println("Booking successful for " + Thread.currentThread().getName());
            System.out.println("Seats left: " + seats);
        } else {
            System.out.println("Seats not available for " + Thread.currentThread().getName());
        }
    }
}

public class UnsynchronizedRailwayBooking {
    public static void main(String[] args) {
        Railway r = new Railway();

        Thread t1 = new Thread(
            () -> r.bookTicket(2), "Passenger 1"
        );

        Thread t2 = new Thread(
            () -> r.bookTicket(1), "Passenger 2"
        );

        t1.start();
        t2.start();
    }
}
