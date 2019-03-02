package structure.bridge;

/**
 * @since 2019/3/2
 */
public class SonyTV extends TV {

    @Override
    void on() {
        System.out.println("Sony.on()");
    }

    @Override
    void off() {
        System.out.println("Sony.off()");
    }

    @Override
    void tuneChannel() {
        System.out.println("Sony.tuneChannel()");
    }
}
