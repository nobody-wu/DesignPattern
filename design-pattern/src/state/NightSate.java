package state;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 10:35 2018/7/10
 */
public class NightSate implements State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() > 18 || w.getHour() < 6){
            System.out.println("晚上睡觉.....");
        }else {
            w.setState(new DayState());
            w.writeProgram();
        }
    }
}
