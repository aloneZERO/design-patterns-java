package behavior.template;

/**
 * @since 2019/3/2
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee addCondiments");
    }
}
