package creation.prototype;

/**
 * 原型模式
 * <p>
 * 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
 *
 * @since 2019/2/15
 */
public abstract class Prototype {
    abstract Prototype myClone();
}
