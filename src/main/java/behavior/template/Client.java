package behavior.template;

/**
 * 模板方法
 *
 * 定义算法框架，并将一些步骤的实现延迟到子类。
 * 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 *
 * 示例：
 * 冲咖啡和冲茶都有类似的流程，但是某些步骤会有点不一样，要求复用那些相同步骤的代码。
 * @since 2019/3/2
 */
public class Client {

    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("=================");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }

}
