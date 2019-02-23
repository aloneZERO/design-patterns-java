package behavior.mediator.colleague;

import behavior.mediator.EvenType;
import behavior.mediator.medi.Mediator;

/**
 * @since 2019/2/23
 */
public class Alarm extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(EvenType.ALARM);
    }

    public void doAlarm() {
        System.out.println("do alarm");
    }
}
