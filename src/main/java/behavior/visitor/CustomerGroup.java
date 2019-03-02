package behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @since 2019/3/2
 */
public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer: customers) {
            customer.accept(visitor);
            System.out.println("===================");
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }

}
