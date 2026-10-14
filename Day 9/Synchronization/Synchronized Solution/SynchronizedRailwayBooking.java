// Resolving race condition using a synchronized method for atomic booking
class Railway {
    int seats = 2;

    synchronized void bookTicket(int requestedSeats) {
        System.out.println(
            Thread.currentThread().getName() + " is booking tickets"
        );

        if (seats >= requestedSeats) {
            seats = seats - requestedSeats;

            System.out.println("Booking successful for " + Thread.currentThread().getName());
            System.out.println("Seats left: " + seats);
        } else {
            System.out.println("Seats not available for " + Thread.currentThread().getName());
        }
    }
}

public class SynchronizedRailwayBooking {
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
