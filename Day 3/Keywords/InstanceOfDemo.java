/**
 * Topic: instanceof Operator
 * Subtopics: Type checking, inheritance hierarchy verification, safe downcasting, Pattern matching for instanceof (Java 16+)
 */
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class InstanceOfDemo {
    public static void main(String[] args) {
        Animal a = new Dog();

        // TODO: Use instanceof to check object types before downcasting
        if (a instanceof Dog) {
            System.out.println("a is an instance of Dog");
        }
    }
}
