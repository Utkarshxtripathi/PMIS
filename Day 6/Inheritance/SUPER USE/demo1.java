package Inheritance.SUPER USE;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating.");
        super.eat();
    }
}


