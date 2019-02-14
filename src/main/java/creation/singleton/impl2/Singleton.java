package creation.singleton.impl2;

/**
 * 懒汉式-线程安全
 * <p>
 * 只需要对 getUniqueInstance() 方法加锁，
 * 那么在一个时间点只能有一个线程能够进入该方法，
 * 从而避免了实例化多次 uniqueInstance。
 * <p>
 * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，
 * 即使 uniqueInstance 已经被实例化了。这会让线程阻塞时间过长，
 * 因此该方法有性能问题，不推荐使用。
 *
 * @author justZero
 * @since 2019/2/14
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
