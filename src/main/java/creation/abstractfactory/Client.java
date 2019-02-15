package creation.abstractfactory;

import creation.abstractfactory.factory.AbstractFactory;
import creation.abstractfactory.factory.ConcreteFactory1;
import creation.abstractfactory.product.AbstractProductA;
import creation.abstractfactory.product.AbstractProductB;

/**
 * @since 2019/2/15
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        // do something with productA and productB
    }

}
