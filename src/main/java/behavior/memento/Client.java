package behavior.memento;

/**
 * 备忘录
 * <p>
 * 在不违反封装的情况下获得对象的内部状态，从而在需要时可以将对象恢复到最初状态。
 * <p>
 * 以下实现了一个简单计算器程序，可以输入两个值，
 * 然后计算这两个值的和。备忘录模式允许将这两个值存储起来，
 * 然后在某个时刻用存储的状态进行恢复。
 *
 * @since 2019/2/23
 */
public class Client {
    public static void main(String[] args) {
        // program starts
        Calculator calculator = new CalcuatorImpl();

        // assume user enters two numbers
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(100);

        // find result
        System.out.println(calculator.getCalculationResult());

        // store result of this calculation in case of error
        PreviousCalculationToCareTaker memento =
                calculator.backupLastCalculation();

        // user enters a number
        calculator.setFirstNumber(33);
        // user enters a wrong second number and calculates result
        calculator.setSecondNumber(-233);

        // calculate result
        System.out.println(calculator.getCalculationResult());

        // user hits CTRL + Z to undo last operation and see last result
        calculator.restorePreviousCalcuation(memento);

        // result restored
        System.out.println(calculator.getCalculationResult());
    }
}
