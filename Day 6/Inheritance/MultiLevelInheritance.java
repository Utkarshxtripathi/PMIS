package Inheritance;

interface Mother {
    void message();
}

interface Father {
    void message();
}

class Child implements Mother, Father {
    @Override
    public void message() {
        System.out.println("Loving both mom and dad.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.message();

        Mother mother = new Child();
        mother.message();

        Father father = new Child();
        father.message();
    }
}
