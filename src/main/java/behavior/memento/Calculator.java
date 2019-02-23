package behavior.memento;

/**
 * Originator Interface
 */
public interface Calculator {

    // create Memento
    PreviousCalculationToCareTaker backupLastCalculation();

    // set Memento
    void restorePreviousCalcuation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);
    void setSecondNumber(int secondNumber);
}
