package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Both references point to the same instance
        System.out.println(singleton1 == singleton2); // Output: true
    }
}
