package behavior.mediator.colleague;

import behavior.mediator.medi.Mediator;

/**
 * 同事，相关对象
 *
 * @since 2019/2/23
 */
public abstract class Colleague {
    public abstract void onEvent(Mediator mediator);
}
