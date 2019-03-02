package structure.composite;

import lombok.AllArgsConstructor;

/**
 * 组件（Component）类是组合类（Composite）和叶子类（Leaf）的父类，
 * 可以把组合类看成是树的中间节点。
 * @since 2019/3/2
 */
@AllArgsConstructor
public abstract class Component {
    protected String name;

    abstract void print(int level);

    public void print() {
        print(0);
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
}
