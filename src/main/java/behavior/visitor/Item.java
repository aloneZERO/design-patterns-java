package behavior.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @since 2019/3/2
 */
@AllArgsConstructor
public class Item implements Element {

    @Getter
    private String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
