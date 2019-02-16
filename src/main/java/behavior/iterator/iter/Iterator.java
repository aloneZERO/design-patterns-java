package behavior.iterator.iter;

/**
 * @since 2019/2/16
 */
public interface Iterator<Item> {
    Item next();
    boolean hasNext();
}
