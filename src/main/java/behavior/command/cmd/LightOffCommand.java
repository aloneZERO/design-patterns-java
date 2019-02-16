package behavior.command.cmd;

import behavior.command.Light;
import lombok.AllArgsConstructor;

/**
 * @since 2019/2/16
 */
@AllArgsConstructor
public class LightOffCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.off();
    }
}
