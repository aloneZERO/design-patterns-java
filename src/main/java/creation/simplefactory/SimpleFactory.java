package creation.simplefactory;

import creation.simplefactory.phone.*;

/**
 * 简单工厂模式
 * <p>
 * 在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。
 *
 * @see <a href="https://cyc2018.github.io/CS-Notes/#/notes/设计模式?id=_2-简单工厂（simple-factory）">详细讲解</a>
 * @since 2019/2/14
 */
public class SimpleFactory {

    public SmartPhone createSmartPhone(String type) {
        switch (type) {
            case Mi9.TYPE:
                return new Mi9();
            case MeizuX8.TYPE:
                return new MeizuX8();
            case SmartisanR1.TYPE:
                return new SmartisanR1();
            default:
                return new FakePhone();
        }
    }

}
