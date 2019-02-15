package creation.factorymethod.phone;

/**
 * 小米9
 *
 * @since 2019/2/14
 */
public class Mi9 implements SmartPhone {

    public static final String TYPE = "mi-9";

    @Override
    public void work() {
        System.out.println("Hello, 米饭! \nAre you OK?");
    }
}
