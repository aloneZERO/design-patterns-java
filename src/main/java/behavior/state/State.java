package behavior.state;

/**
 * @since 2019/2/25
 */
public interface State {

    /**
     * 投入25美分
     */
    void insertQuarter();

    /**
     * 退回25美分
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
