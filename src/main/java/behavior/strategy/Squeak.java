package behavior.strategy;

/**
 * 吱吱叫
 * @since 2019/3/2
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
