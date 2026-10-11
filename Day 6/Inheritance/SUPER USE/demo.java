package Inheritance.SUPER USE;

class Employee {
    double salary = 30000;
}

class Manager extends Employee {
    double salary = 60000;

    void displaySalary() {
        System.out.println("Manager Salary: " + salary);
        System.out.println("Employee salary: " + super.salary);
    }
}

