package command;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 15:03 2018/8/21
 */
public class Invoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void excuteCommand(){
        command.excute();
    }
}
