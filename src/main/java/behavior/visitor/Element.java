package behavior.visitor;

/**
 * @since 2019/3/2
 */
public interface Element {
    void accept(Visitor visitor);
}
