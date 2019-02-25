package behavior.observer;

/**
 * @since 2019/2/25
 */
public interface Observer {
    // 温度、湿度、压强
    void update(float temp, float humidity, float pressure);
}
