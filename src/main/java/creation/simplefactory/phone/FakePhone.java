package creation.simplefactory.phone;

/**
 * @author justZero
 * @since 2019/2/14
 */
public class FakePhone implements SmartPhone {

    @Override
    public void work() {
        throw new RuntimeException("我是 FakePhone！我无法工作~");
    }
}
