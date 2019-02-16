package behavior.iterator;

import behavior.iterator.aggr.Aggreate;
import behavior.iterator.aggr.ConcreteAggregate;
import behavior.iterator.iter.Iterator;

/**
 * 迭代器
 * <p>
 * 提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。
 *
 * @since 2019/2/16
 */
public class Client {

    public static void main(String[] args) {
        Aggreate aggreate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggreate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
