package behavior.memento;

/**
 * Memento Interface to Originator
 * <p>
 * This interface allows the originator to restore its state
 *
 * @since 2019/2/23
 */
public interface PreviousCalculationToOriginator {
    int getFirstNumber();

    int getSecondNumber();
}
