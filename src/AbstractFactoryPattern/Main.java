package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        // Create a factory instance
        AbstractFactory factory = new ConcreteFactory1();

        // Use the factory to create products
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();

        // Perform operations on the products
        productA.operationA();
        productB.operationB();
    }
}
