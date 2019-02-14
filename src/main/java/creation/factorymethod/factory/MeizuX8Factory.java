package creation.factorymethod.factory;

import creation.factorymethod.phone.MeizuX8;
import creation.factorymethod.phone.SmartPhone;

/**
 * @author justZero
 * @since 2019/2/14
 */
public class MeizuX8Factory extends Factory {

    @Override
    public SmartPhone factoryMethod() {
        return new MeizuX8();
    }
}
