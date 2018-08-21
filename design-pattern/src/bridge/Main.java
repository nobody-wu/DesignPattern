package bridge;

/**
 * @Author: wujiapeng
 * @Description: 桥接模式
 * @Date: created in 11:35 2018/8/21
 */
public class Main {

    public static void main(String[] args) {
        // 自由组合
        Mobile mobile = new Mobile(new MobileA(), new SoftA());
        mobile.run();

        Mobile mobile1 = new Mobile(new MobileB(), new SoftA());
        mobile1.run();
    }

}
