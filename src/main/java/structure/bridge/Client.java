package structure.bridge;

/**
 * 桥接
 *
 * 将抽象与实现分离开来，使它们可以独立变化。
 *
 * 示例：
 * RemoteControl 表示遥控器，指代 Abstraction。
 * TV 表示电视，指代 Implementor。
 * 桥接模式将遥控器和电视分离开来，从而可以独立改变遥控器或者电视的实现。
 *
 * @since 2019/3/2
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl1 = new ConcreteRemoteControl1(new LeTV());
        remoteControl1.on();
        remoteControl1.off();
        remoteControl1.tuneChannel();
        System.out.println("=================================");
        RemoteControl remoteControl2 = new ConcreteRemoteControl2(new SonyTV());
        remoteControl2.on();
        remoteControl2.off();
        remoteControl2.tuneChannel();
    }
}
