package command;

/**
 * @Author: wujiapeng
 * @Description: 命令模式
 * @Date: created in 14:40 2018/8/21
 */
public class Main {
    public static void main(String[] args) {
        // 真正执行任务的对象
        Receiver receiver = new Receiver();
        // 将执行任务的对象放入命令中
        Command c1 = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        // 将命令放入执行人对象中
        invoker.setCommand(c1);
        // 执行命令
        invoker.excuteCommand();
    }
}
