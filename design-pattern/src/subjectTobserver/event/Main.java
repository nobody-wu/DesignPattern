package subjectTobserver.event;

import java.util.Date;

/**
 * 观察者模式（发布-订阅模式）：
 * 针对缺点：观察者的接口要统一，这个在实际开发中往往比较难做到
 * <p>
 * 采用事件委托的处理方法，可以很好的解决这个缺点(不要直接调用方法，而是通过反射获取方法)
 * <p>
 * 实际案例：guava eventbus
 */
public class Main {

    public static void main(String[] args) {
        Notifier goodNotifier = new subjectTobserver.event.Boss();

        NBAObserver nbaObserver = new NBAObserver("1","zhangsan");

        subjectTobserver.event.StockObserver stockObserver = new  subjectTobserver.event.StockObserver("2", "lisi");
        goodNotifier.addListener(nbaObserver, "handleNBA", new Date());
        goodNotifier.addListener(stockObserver, "handleStock", new Date());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        goodNotifier.notifyX();
    }
}
