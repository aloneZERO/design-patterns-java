package creation.abstractfactory.factory;

import creation.abstractfactory.product.AbstractProductA;
import creation.abstractfactory.product.AbstractProductB;
import creation.abstractfactory.product.ProductA1;
import creation.abstractfactory.product.ProductB1;

/**
 * @since 2019/2/15
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
