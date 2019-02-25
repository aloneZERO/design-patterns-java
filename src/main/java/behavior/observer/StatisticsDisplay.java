package behavior.observer;

/**
 * @since 2019/2/25
 */
public class StatisticsDisplay implements Observer {

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: "+
                temp+" "+humidity+" "+pressure);
    }
}
