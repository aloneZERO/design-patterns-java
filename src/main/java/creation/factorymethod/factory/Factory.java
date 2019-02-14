package creation.factorymethod.factory;

import creation.factorymethod.phone.SmartPhone;

/**
 * 工厂方法
 *
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。
 * 工厂方法把实例化操作推迟到子类。
 *
 * @author justZero
 * @since 2019/2/14
 */
public abstract class Factory {
    abstract public SmartPhone factoryMethod();

    public void doSomething() {
        SmartPhone smartPhone = factoryMethod();
        smartPhone.work();
        // do other things with the smartPhone
    }
}
