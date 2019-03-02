package structure.facade;

/**
 * 外观
 * <p>
 * 提供了一个统一的接口，用来访问子系统中的一群接口，
 * 从而让子系统更容易使用。
 *
 * 示例：观看电影需要操作很多电器，使用外观模式实现一键看电影功能。
 *
 * @since 2019/3/2
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchMovie();
    }
}
