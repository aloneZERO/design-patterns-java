package creation.factorymethod.phone;

/**
 * 魅族X8
 *
 * @author justZero
 * @since 2019/2/14
 */
public class MeizuX8 implements SmartPhone {

    public static final String TYPE = "meizu-x8";

    @Override
    public void work() {
        System.out.println("欢迎使用魅族X8~");
    }
}
