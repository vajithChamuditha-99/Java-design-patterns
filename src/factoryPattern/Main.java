package factoryPattern;

public class Main {
    public static void main(String[] args) {
        // Create a factory instance
        Factory factory = new ConcreteFactoryA();

        // Use the factory to create a product
        Product product = factory.createProduct();

        // Perform the operation on the product
        product.operation();
    }
}
