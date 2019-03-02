package structure.flyweight;

import java.util.HashMap;

/**
 * @since 2019/3/2
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights =
            new HashMap<>();

    Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            Flyweight flyweight =
                    new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }
        return flyweights.get(intrinsicState);
    }

}
