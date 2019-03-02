package behavior.visitor;

/**
 * @since 2019/3/2
 */
public interface Visitor {

    void visit(Customer customer);

    void visit(Item item);

    void visit(Order order);
}
