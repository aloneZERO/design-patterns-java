package creation.prototype;

/**
 * @since 2019/2/15
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("leo");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
        assert "leo".equals(clone.toString());
    }
}
