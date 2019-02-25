package behavior.state;

/**
 * @since 2019/2/25
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投过币了！别投啦！！！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已退币，请查收");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了曲柄...请稍等");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("没有口香糖出来");
    }
}
