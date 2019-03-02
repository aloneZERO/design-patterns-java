package structure.bridge;

import lombok.AllArgsConstructor;

/**
 * @since 2019/3/2
 */
@AllArgsConstructor
public abstract class RemoteControl {
    protected TV tv;

    public abstract void on();
    public abstract void off();
    public abstract void tuneChannel();
}
