/**
 * Topic: Design Patterns - Singleton Pattern
 * Subtopics: Creational design pattern, single instance, private constructor, public static getInstance()
 */
class DatabaseConnection {
    private static DatabaseConnection instance;

    // Private constructor prevents instantiation outside
    private DatabaseConnection() {
        System.out.println("Database connection established.");
    }

    // Global access point
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        DatabaseConnection c1 = DatabaseConnection.getInstance();
        DatabaseConnection c2 = DatabaseConnection.getInstance();

        System.out.println("Are both instances identical? " + (c1 == c2));
    }
}
