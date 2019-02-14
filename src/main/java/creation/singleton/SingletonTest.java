package creation.singleton;

import org.junit.Test;
import creation.singleton.impl6.Singleton;

import static org.junit.Assert.*;

/**
 * @author justZero
 * @since 2019/2/14
 */
public class SingletonTest {

    @Test
    public void testSingletonByEnum() {
        // 单例测试
        Singleton firstSingleton = Singleton.INSTANCE;
        firstSingleton.setObjName("firstName");
        assertEquals("firstName", firstSingleton.getObjName());

        Singleton secondSingleton = Singleton.INSTANCE;
        secondSingleton.setObjName("secondName");
        assertEquals("secondName", firstSingleton.getObjName());
        assertEquals("secondName", secondSingleton.getObjName());

        assertSame(firstSingleton, secondSingleton);

        // 反射获取实例测试
        try {
            Singleton[] enumConstants = Singleton.class.getEnumConstants();
            assertEquals(1, enumConstants.length);
            for (Singleton enumConstant : enumConstants) {
                assertEquals("secondName", enumConstant.getObjName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
