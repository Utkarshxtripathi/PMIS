package Inheritance;
class Animal
{
    void eat()
    {
        System.out.println("Animal Food");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog Bark");
    }
}

public class SingleInheritance {
    public static void main(String[]args){
        Dog myDog = new Dog();
        myDog. eat();
        myDog.bark();
    }
    
}





