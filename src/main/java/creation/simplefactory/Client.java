package creation.simplefactory;

import creation.simplefactory.phone.MeizuX8;
import creation.simplefactory.phone.Mi9;
import creation.simplefactory.phone.SmartPhone;

/**
 * 以下的 Client 类包含了实例化的代码，这是一种错误的实现。
 * 如果在客户类中存在这种实例化代码，就需要考虑将代码放到简单工厂中。
 *
 * @author justZero
 * @since 2019/2/14
 */
public class Client {

    public static void main(String[] args) {
        String type = "";
        if (args != null && args.length > 0) {
            type = args[0];
        }

        SmartPhone smartPhone;
        switch (type) {
            case Mi9.TYPE:
                smartPhone = new Mi9();
                break;
            case MeizuX8.TYPE:
                smartPhone = new MeizuX8();
                break;
        }
        // do something with the smartphone ......
    }

}
