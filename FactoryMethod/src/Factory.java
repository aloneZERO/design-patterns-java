public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomethind() {
        Product product = factoryMethod();
        // do something with the product
    }
}
