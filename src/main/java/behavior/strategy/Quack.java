package behavior.strategy;

/**
 * 嘎嘎叫
 * @since 2019/3/2
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack！");
    }
}
