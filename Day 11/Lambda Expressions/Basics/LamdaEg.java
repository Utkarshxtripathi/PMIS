//Without Lamda

@FunctionalInterface
interface Greeter {
    void greet(String name);
}

public class LamdaEg {
    public static void main(String[] args) {
        Greeter g = new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        g.greet("Utkarsh");
    }
}


//With Lamda
class LambdaExample {
    public static void main(String[] args) {
        Greeter g = name -> System.out.println("Hello, " + name);
        g.greet("Utkarsh");
    }
}
