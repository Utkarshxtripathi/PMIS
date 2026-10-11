package Constructor;

class StudentProfile {

    String name;
    int studentId;
    double score;

    // Constructor 1: Exam Taker
    StudentProfile(String name, int studentId, double score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    // Constructor 2: Direct Walk-in
    StudentProfile(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.score = 0.0;
    }

    // Determine grade
    char getGrade() {

        if (score >= 90) {
            return 'A';
        } else if (score >= 75) {
            return 'B';
        } else if (score >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Print report card
    void printReportCard() {

        System.out.println("----- Report Card -----");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + getGrade());
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Exam Taker
        StudentProfile student1 =
                new StudentProfile("Rahul", 101, 82.5);

        // Direct Walk-in
        StudentProfile student2 =
                new StudentProfile("Aman", 102);

        // Print both report cards
        student1.printReportCard();
        student2.printReportCard();
    }
}