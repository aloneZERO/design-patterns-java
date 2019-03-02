package behavior.visitor;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @since 2019/3/2
 */
public class Customer implements Element {

    @Getter
    private String name;
    private List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order: orders) {
            order.accept(visitor);
        }
    }
}
