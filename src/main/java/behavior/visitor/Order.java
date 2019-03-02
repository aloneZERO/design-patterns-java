package behavior.visitor;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @since 2019/3/2
 */
public class Order implements Element {

    @Getter
    private String name;
    private List<Item> items = new ArrayList<>();

    Order(String name) {
        this.name = name;
    }

    Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Item item : items) {
            item.accept(visitor);
        }
    }
}
