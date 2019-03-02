package behavior.strategy;

import lombok.Setter;

/**
 * @since 2019/3/2
 */
@Setter
public class Duck {

    private QuackBehavior quackBehavior;

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

}
