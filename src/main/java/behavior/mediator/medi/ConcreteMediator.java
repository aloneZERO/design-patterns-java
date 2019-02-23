package behavior.mediator.medi;

import behavior.mediator.EvenType;
import behavior.mediator.colleague.Alarm;
import behavior.mediator.colleague.Calender;
import behavior.mediator.colleague.CoffeePot;
import behavior.mediator.colleague.Sprinkler;
import lombok.AllArgsConstructor;

/**
 * @since 2019/2/23
 */
@AllArgsConstructor
public class ConcreteMediator extends Mediator {

    private Alarm alarm;
    private CoffeePot coffeePot;
    private Calender calender;
    private Sprinkler sprinkler;

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case EvenType.ALARM:
                doAlarmEvent();
                break;
            case EvenType.COFFEE_POT:
                doCoffeePotEvent();
                break;
            case EvenType.CALENDER:
                doCalenderEvent();
                break;
            case EvenType.SPRINKLER:
                doSprinklerEvent();
                break;
        }
    }

    private void doAlarmEvent() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    private void doCoffeePotEvent() {
        // TODO
    }

    private void doCalenderEvent() {
        // TODO
    }

    private void doSprinklerEvent() {
        // TODO
    }
}
