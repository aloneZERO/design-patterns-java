package behavior.observer;

/**
 * 观察者
 * <p>
 * 定义对象之间的一对多依赖，当一个对象状态改变时，
 * 它的所有依赖都会收到通知并且自动更新状态。
 * <p>
 * 主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者。
 * <p>
 * 示例：天气数据布告板会在天气信息发生改变时更新其内容，布告板有多个，并且在将来会继续增加。
 *
 * @since 2019/2/25
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1,1);
    }
}
