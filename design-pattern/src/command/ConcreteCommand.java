package command;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 14:59 2018/8/21
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
