package creation.singleton.impl4;

/**
 * 双重校验锁-线程安全
 * <p>
 * uniqueInstance 只需要被实例化一次，之后就可以直接使用了。
 * 加锁操作只需要对实例化那部分的代码进行，
 * 只有当 uniqueInstance 没有被实例化时，才需要进行加锁。
 * <p>
 * 双重校验锁先判断 uniqueInstance 是否已经被实例化，
 * 如果没有被实例化，那么才对实例化语句进行加锁。
 *
 * @author justZero
 * @see <a href="https://cyc2018.github.io/CS-Notes/#/notes/设计模式?id=Ⅳ-双重校验锁-线程安全">详细讲解</a>
 * @see <a href="https://cyc2018.github.io/CS-Notes/#/notes/Java%20并发?id=_3-volatile-变量规则">volatile 关键字</a>
 * @since 2019/2/14
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
