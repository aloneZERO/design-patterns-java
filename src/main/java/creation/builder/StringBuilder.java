package creation.builder;

/**
 * @since 2019/2/15
 */
public class StringBuilder extends AbstractStringBuilder {

    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // create a copy, don't share the array
        return new String(value, 0, count);
    }
}
