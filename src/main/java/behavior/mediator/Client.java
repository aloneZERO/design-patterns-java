package behavior.mediator;

import behavior.mediator.colleague.Alarm;
import behavior.mediator.colleague.Calender;
import behavior.mediator.colleague.CoffeePot;
import behavior.mediator.colleague.Sprinkler;
import behavior.mediator.medi.ConcreteMediator;
import behavior.mediator.medi.Mediator;

/**
 * 中介者模式
 * <p>
 * 集中相关对象之间复杂的沟通和控制方式。
 *
 * @since 2019/2/23
 */
public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calender calender = new Calender();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(
                alarm, coffeePot, calender, sprinkler);
        // 闹钟事件到达，调用中介者就可以操作相关对象
        alarm.onEvent(mediator);
    }
}
