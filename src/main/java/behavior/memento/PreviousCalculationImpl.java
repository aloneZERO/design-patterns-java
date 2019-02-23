package behavior.memento;

import lombok.AllArgsConstructor;

/**
 * Memento Object Implementation
 * <p>
 * Note that this object implements both interfaces to Originator and CareTaker
 *
 * @since 2019/2/23
 */
@AllArgsConstructor
public class PreviousCalculationImpl implements
        PreviousCalculationToCareTaker,
        PreviousCalculationToOriginator {

    private int firstNumber;
    private int secondNumber;

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
