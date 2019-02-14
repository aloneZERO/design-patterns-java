package creation.simplefactory;

import creation.simplefactory.phone.Mi9;
import creation.simplefactory.phone.SmartPhone;

/**
 * 使用简单工厂创建客户端
 *
 * @author justZero
 * @since 2019/2/14
 */
public class BetterClient {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        SmartPhone smartPhone = simpleFactory
                .createSmartPhone(Mi9.TYPE);
        smartPhone.work();
        // do other things with the smartphone
    }

}
