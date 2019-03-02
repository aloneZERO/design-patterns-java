package structure.composite;

/**
 * 组合
 *
 * 将对象组合成树形结构来表示“整体/部分”层次关系，
 * 允许用户以相同的方式处理单独对象和组合对象。
 * @since 2019/3/2
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Component node1 = new Leaf("1");
        Component node2 = new Composite("2");
        Component node3 = new Leaf("3");
        root.add(node1);
        root.add(node2);
        root.add(node3);

        Component node21 = new Leaf("21");
        Component node22 = new Composite("22");
        node2.add(node21);
        node2.add(node22);

        Component node221 = new Leaf("221");
        node22.add(node221);

        root.print();
    }
}
