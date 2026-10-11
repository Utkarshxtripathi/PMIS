class Employee {

    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Salary
    public double getSalary() {
        return salary;
    }

    // Setter for Salary
    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // Give Raise
    public void giveRaise(double percent) {

        if (percent > 0) {
            double raiseAmount = salary * (percent / 100.0);

            salary = salary + raiseAmount;

            System.out.println(
                name + " received a " + percent +
                "% raise. New Salary: ₹" + salary
            );

        } else {
            System.out.println("Raise percentage must be positive.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Alice", 50000.0);

        System.out.println("Initial Salary: ₹" + emp.getSalary());

        // Apply 8% raise
        emp.giveRaise(8);

        // Try negative salary
        emp.setSalary(-25000);

        // Final salary
        System.out.println(
            "Final Verified Salary: ₹" + emp.getSalary()
        );
    }
}