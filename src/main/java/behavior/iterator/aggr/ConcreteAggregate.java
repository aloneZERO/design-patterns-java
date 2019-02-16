package behavior.iterator.aggr;

import behavior.iterator.iter.ConcreteIterator;
import behavior.iterator.iter.Iterator;

import java.util.Arrays;
import java.util.Random;

/**
 * @since 2019/2/16
 */
public class ConcreteAggregate implements Aggreate {

    private Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for (int i=0; i< items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<>(items);
    }
}
