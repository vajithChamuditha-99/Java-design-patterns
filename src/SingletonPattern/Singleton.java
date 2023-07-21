package SingletonPattern;

public class Singleton {
    // Private static instance variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent direct instantiation from outside the class
    private Singleton() {
        // Initialization code (optional)
    }

    // Public static method to access the single instance
    public static Singleton getInstance() {
        // Check if the instance is null, create it if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and attributes of the Singleton class (if any)
}