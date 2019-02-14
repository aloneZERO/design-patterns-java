package creation.factorymethod;

import creation.factorymethod.factory.Factory;
import creation.factorymethod.factory.SmartisanR1Factory;
import creation.factorymethod.phone.SmartPhone;

/**
 * @author justZero
 * @since 2019/2/14
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new SmartisanR1Factory();
        factory.doSomething();
    }

}
