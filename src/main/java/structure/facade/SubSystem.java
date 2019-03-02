package structure.facade;

/**
 * @since 2019/3/2
 */
public class SubSystem {
    public void turnOnTV() {
        System.out.println("turn on TV");
    }

    public void setCD(String cd) {
        System.out.println("set CD (" + cd + ")");
    }

    public void startWatching() {
        System.out.println("start watching");
    }
}
