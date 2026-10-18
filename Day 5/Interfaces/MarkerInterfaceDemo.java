/**
 * Topic: Interfaces - Marker (Tagging) Interface
 * Subtopics: Marker interface concept, Serializable / Cloneable, Custom Marker Interface
 * 
 * Key Concept:
 * - A Marker Interface is an empty interface with NO methods or fields.
 * - Used to provide run-time type information about objects to the JVM or custom frameworks.
 */
interface Deletable {
    // Marker interface - deliberately empty
}

class Entity implements Deletable {
    String name = "Test Entity";
}

public class MarkerInterfaceDemo {
    public static void delete(Object obj) {
        if (obj instanceof Deletable) {
            System.out.println("Object is Deletable. Proceeding with deletion...");
        } else {
            System.out.println("Access Denied: Object does NOT implement Deletable.");
        }
    }

    public static void main(String[] args) {
        Entity e = new Entity();
        delete(e);
    }
}
