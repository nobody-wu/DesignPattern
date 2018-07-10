package state;

/**
 * @Author: wujiapeng
 * @Description: 状态模式
 * @Date: created in 10:36 2018/7/10
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work(new DayState());
        work.setHour(16);
        work.writeProgram();
    }
}
