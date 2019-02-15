package creation.factorymethod.phone;

/**
 * @since 2019/2/14
 */
public class SmartisanR1 implements SmartPhone {

    public static final String TYPE = "smartisan-r1";

    @Override
    public void work() {
        System.out.println("李姐万岁！");
    }
}
