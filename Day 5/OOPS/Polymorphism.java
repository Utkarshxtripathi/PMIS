//compile Time 
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


//Run time
class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Animal pet1 = new Dog();
        Animal pet2 = new Cat();
        Animal pet3 = new Animal();

        pet1.makeSound();
        pet2.makeSound();
        pet3.makeSound();
    }
}