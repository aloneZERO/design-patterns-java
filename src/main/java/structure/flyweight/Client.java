package structure.flyweight;

/**
 * 享元
 *
 * 利用共享的方式来支持大量细粒度的对象，
 * 这些对象一部分内部状态是相同的。
 *
 * @since 2019/3/2
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("aa");
        Flyweight flyweight2 = factory.getFlyweight("aa");

        flyweight1.doOperation("x");
        flyweight2.doOperation("y");
    }
}
