package structure.bridge;

/**
 * @since 2019/3/2
 */
public class LeTV extends TV {

    @Override
    void on() {
        System.out.println("LeTV.on()");
    }

    @Override
    void off() {
        System.out.println("LeTV.off()");
    }

    @Override
    void tuneChannel() {
        System.out.println("LeTV.tuneChannel()");
    }
}
