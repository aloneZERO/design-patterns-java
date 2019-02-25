package behavior.state;

/**
 * @since 2019/2/25
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("别投币了，我已经给你口香糖啦，老哥！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("抱歉，你已经转动了曲柄，不能退币了哦");
    }

    @Override
    public void turnCrank() {
        System.out.println("你就是多转一次曲柄，也没有多余的口香糖！");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("哇哦哦，卖完喽！");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
