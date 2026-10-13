abstract class Shape {
    private String colour;

    void setColor(String colour) {
        this.colour = colour;
    }

    String getColor() {
        return colour;
    }

    abstract double calculateArea();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class abstract1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setColor("Red");
        System.out.println(circle.getColor() + " circle area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setColor("Blue");
        System.out.println(rectangle.getColor() + " rectangle area: " + rectangle.calculateArea());
    }
}