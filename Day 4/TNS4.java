class Car {
    String color;
    String Brand;
    int speed;

    Car(String color, String Brand, int speed) {
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println(Brand + "\n" + color + "\n" + speed);
    }

    void accelerate(int incr) {
        int or_speed = speed;
        speed += incr;

        System.out.println("Original Speed:" + or_speed);
        System.out.println(Brand + " accelerated by " + speed + " Km/hr");
    }
}

public class TNS4 {
    public static void main(String[] args) {
        Car c1 = new Car("Black", "BMW", 60);
        c1.displayInfo();
        c1.accelerate(50);
    }
}
