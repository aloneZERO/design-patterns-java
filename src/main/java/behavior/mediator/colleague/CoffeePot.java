package behavior.mediator.colleague;

import behavior.mediator.EvenType;
import behavior.mediator.medi.Mediator;

/**
 * @since 2019/2/23
 */
public class CoffeePot extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(EvenType.COFFEE_POT);
    }

    public void doCoffeePot() {
        System.out.println("do coffee pot");
    }
}
