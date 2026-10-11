package Inheritance;

// Hierarchical inheritance: Circle and Rectangle share Shape as their parent.
class Shape {
    String color = "Blue";
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a " + color + " circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a " + color + " rectangle.");
    }
}

public class hieraricalInheritance  {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.drawCircle();
        rectangle.drawRectangle();
    }
}