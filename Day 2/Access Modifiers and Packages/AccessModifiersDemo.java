/**
 * Topic: Access Modifiers & Packages
 * Subtopics: public, protected, default (package-private), private; package declarations and imports
 * 
 * Rules:
 * - private: Accessible ONLY within the same class.
 * - default (no keyword): Accessible ONLY within the same package.
 * - protected: Accessible within the same package and subclasses (even in different packages).
 * - public: Accessible from anywhere.
 */
public class AccessModifiersDemo {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // package-private
    private int privateVar = 40;

    public void displayAccess() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }

    public static void main(String[] args) {
        // TODO: Create classes in different packages to test access boundaries
        AccessModifiersDemo demo = new AccessModifiersDemo();
        demo.displayAccess();
    }
}
