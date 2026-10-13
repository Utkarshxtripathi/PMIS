
class student {
    String name;
    static String collegeName = "IIT Bombay";

    student(String name) {
        this.name = name;
    }

    void stucol() {
        System.out.println(name + " studies in " + collegeName);
    }
}

public class staticL {
    public static void main(String[] args) {
        student s1 = new student("Utkarsh");
        s1.stucol();
    }
}

