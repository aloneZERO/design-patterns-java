package creation.abstractfactory.factory;

import creation.abstractfactory.product.AbstractProductA;
import creation.abstractfactory.product.AbstractProductB;
import creation.abstractfactory.product.ProductA2;
import creation.abstractfactory.product.ProductB2;

/**
 * @since 2019/2/15
 */
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
