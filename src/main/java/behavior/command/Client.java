package behavior.command;

import behavior.command.cmd.Command;
import behavior.command.cmd.LightOffCommand;
import behavior.command.cmd.LightOnCommand;

/**
 * 命令模式
 * <p>
 * 将命令封装到对象中，具有以下作用：<br/>
 * <pre>
 * 1. 使用命令来参数化其它对象
 * 2. 将命令放入队列中进行排队
 * 3. 将命令的操作记录到日志中
 * 4. 支持可撤销的操作
 * </pre>
 * 实例：设计一个遥控器，可以控制电灯开关
 *
 * @since 2019/2/16
 */
public class Client {

    // Client: 可以设置命令和作为命令的接收者
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command lightOnCmd = new LightOnCommand(light);
        Command lightOffCmd = new LightOffCommand(light);
        invoker.setOnCommands(lightOnCmd, 0);
        invoker.setOffCommands(lightOffCmd, 0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }

}
