package behavior.mediator.colleague;

import behavior.mediator.EvenType;
import behavior.mediator.medi.Mediator;

/**
 * @since 2019/2/23
 */
public class Sprinkler extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(EvenType.SPRINKLER);
    }

    public void doSprinkler() {
        System.out.println("do sprinkler");
    }
}
