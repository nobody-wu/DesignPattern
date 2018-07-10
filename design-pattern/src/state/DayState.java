package state;

/**
 * @Author: wujiapeng
 * @Description: 白天状态
 * @Date: created in 10:34 2018/7/10
 */
public class DayState implements State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 18 && w.getHour() > 9){
            System.out.println("白天干活.....");
        }else {
            w.setState(new NightSate());
            w.writeProgram();
        }
    }
}
