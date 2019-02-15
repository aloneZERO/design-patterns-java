package creation.factorymethod.factory;

import creation.factorymethod.phone.Mi9;
import creation.factorymethod.phone.SmartPhone;

/**
 * @since 2019/2/14
 */
public class Mi9Factory extends Factory {

    @Override
    public SmartPhone factoryMethod() {
        return new Mi9();
    }
}
