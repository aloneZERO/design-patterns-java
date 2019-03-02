package behavior.template;

/**
 * @since 2019/3/2
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("tea addCondiments");
    }
}
