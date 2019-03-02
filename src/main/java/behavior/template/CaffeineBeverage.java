package behavior.template;

/**
 * @since 2019/3/2
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    // 以下是重复步骤，可复用

    void boilWater() {
        System.out.println("boil water");
    }

    void pourInCup() {
        System.out.println("pour in cup");
    }
}
