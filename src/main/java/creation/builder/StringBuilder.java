package creation.builder;

/**
 * 生成器模式
 * <p>
 * 封装一个对象的构造过程，并允许按步骤构造。
 *
 * @since 2019/2/15
 */
public class StringBuilder extends AbstractStringBuilder {

    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // create a copy, don't share the array
        return new String(value, 0, count);
    }
}
