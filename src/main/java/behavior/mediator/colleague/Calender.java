package behavior.mediator.colleague;

import behavior.mediator.EvenType;
import behavior.mediator.medi.Mediator;

/**
 * @since 2019/2/23
 */
public class Calender extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(EvenType.CALENDER);
    }

    public void doCalender() {
        System.out.println("do calender");
    }
}
