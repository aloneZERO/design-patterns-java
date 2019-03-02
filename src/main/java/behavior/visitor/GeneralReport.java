package behavior.visitor;

/**
 * @since 2019/3/2
 */
public class GeneralReport implements Visitor {

    private int customersNO;
    private int ordersNO;
    private int itemsNO;


    @Override
    public void visit(Customer customer) {
        System.out.println(customer.getName());
        customersNO++;
    }

    @Override
    public void visit(Item item) {
        System.out.println(item.getName());
        itemsNO++;
    }

    @Override
    public void visit(Order order) {
        System.out.println(order.getName());
        ordersNO++;
    }

    public void displayResults() {
        System.out.println("Number of customers: " + customersNO);
        System.out.println("Number of orders:    " + ordersNO);
        System.out.println("Number of items:     " + itemsNO);
    }
}
