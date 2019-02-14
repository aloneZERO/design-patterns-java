package creation.factorymethod.factory;

import creation.factorymethod.phone.SmartPhone;
import creation.factorymethod.phone.SmartisanR1;

/**
 * @author justZero
 * @since 2019/2/14
 */
public class SmartisanR1Factory extends Factory {

    @Override
    public SmartPhone factoryMethod() {
        return new SmartisanR1();
    }
}
