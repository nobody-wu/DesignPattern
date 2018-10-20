package command;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 14:58 2018/8/21
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void excute();
}
