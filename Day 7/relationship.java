/*
1. IS-A Relationship (Inheritance)
An IS-A relationship represents inheritance. When class B inherits from class A, it means B is a...

Implemented via: The extends keyword (or implements for interfaces).

Plain English test: "Is a Dog an Animal?" Yes. Therefore, Dog IS-A Animal.


2. HAS-A Relationship (Composition / Aggregation)
A HAS-A relationship represents containment or ownership. It means one class holds a reference to...

Implemented via: Declaring an instance of one class inside another class.

Plain English test: "Does a Car have an Engine?" Yes. Therefore, Car HAS-A Engine. (A car is not...)
*/
 

// class Engine{
//     void start(){
//         System.out.println("Engine is Starting....");
//     }
// }
// class car{
//     private Engine engine;
//     car(){
//         this.engine  = new Engine();
//     }
//     void drive(){
//         engine.start();
//         System.out.println("car is moving");
//     }
// }

// class Address{
// String city;
// String state;
// int pincode;

// Address(String city, String state, int pincode){
// this.city = city;
// this.state = state;
// this.pincode = pincode;
// }
// void displayAddress(){
// System.out.println(city + ", "+ state + ", " + pincode);
// }
// }
// class Student{
// String name;
// int rollNumber;
// Address address;

// Student(String name, int rollNumber, Address address){
// this.name = name;
// this.rollNumber = rollNumber;
// this.address = address;
// }
// void displayProfile(){
// System.out.println("Student: "+ name + "\nRoll No. "+rollNumber);
// System.out.println( "Lives at: ");
// address.displayAddress();

// }
// }

class Battery {
    int capacitymaH;

    Battery(int capacitymaH) {
        this.capacitymaH = capacitymaH;
    }
}

class Camera {
    int pix;

    Camera(int pix) {
        this.pix = pix;
    }

    void takePhoto() {
        System.out.println("Click... Captured a photo with " + pix + " sensor");
    }
}

class Phone {
    String brand;
    Battery battery;
    Camera camera;

    Phone(String brand, Battery battery, Camera camera) {
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }

    void snapPicture() {
        camera.takePhoto();
    }
}