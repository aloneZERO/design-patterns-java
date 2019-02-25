package behavior.observer;

/**
 * @since 2019/2/25
 */
public class CurrentConditionDisplay implements Observer {

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionDisplay.update: "+
                temp+" "+humidity+" "+pressure);
    }
}
