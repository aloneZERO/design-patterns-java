package behavior.command;

import behavior.command.cmd.Command;

/**
 * 遥控器
 * <p>
 * 通过 invoker 来调用命令
 *
 * @since 2019/2/16
 */
public class Invoker {
    private static final int SLOT_NUM = 7; // 每种类型的命令都有7个键位
    private Command[] onCommands;
    private Command[] offCommands;

    public Invoker() {
        this.onCommands = new Command[SLOT_NUM];
        this.offCommands = new Command[SLOT_NUM];
    }

    public void setOnCommands(Command command, int slot) {
        onCommands[slot] = command;
    }

    public void setOffCommands(Command command, int slot) {
        offCommands[slot] = command;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
