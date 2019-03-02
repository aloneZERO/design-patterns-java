package structure.flyweight;

import lombok.AllArgsConstructor;

/**
 * @since 2019/3/2
 */
@AllArgsConstructor
public class ConcreteFlyweight implements Flyweight {

    // IntrinsicState：内部状态，享元对象共享内部状态
    private String intrinsicState;

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address: "
                + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
