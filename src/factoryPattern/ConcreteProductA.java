package factoryPattern;

class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("Performing operation in ConcreteProductA");
    }
}
