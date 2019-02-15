package creation.abstractfactory.factory;

import creation.abstractfactory.product.AbstractProductA;
import creation.abstractfactory.product.AbstractProductB;

/**
 * 抽象工厂模式
 * <p>
 * 提供一个接口，用于创建相关的对象家族。
 *
 * @see <a href="https://cyc2018.github.io/CS-Notes/#/notes/设计模式?id=_4-抽象工厂（abstract-factory）">详细讲解</a>
 * @since 2019/2/15
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
