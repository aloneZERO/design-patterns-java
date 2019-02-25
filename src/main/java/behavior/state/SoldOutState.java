package behavior.state;

/**
 * @since 2019/2/25
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("无法投币！售空啦！！！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无法退币！你还没投呢~");
    }

    @Override
    public void turnCrank() {
        System.out.println("虽然你转了曲柄，但我没有口香糖卖给你~");
    }

    @Override
    public void dispense() {
        System.out.println("没有口香糖出来");
    }
}
