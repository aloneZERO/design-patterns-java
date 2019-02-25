package behavior.state;

/**
 * @since 2019/2/25
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投入了25美分");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币？你还没有投币哦");
    }

    @Override
    public void turnCrank() {
        System.out.println("还没投币呢！转也没用");
    }

    @Override
    public void dispense() {
        System.out.println("请先投币！");
    }
}
