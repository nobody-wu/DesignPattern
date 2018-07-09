package builder;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 17:36 2018/7/9
 */
public class Tom extends PersonBuilder {
    @Override
    public void firstName() {
        System.out.println("jiapeng");
    }

    @Override
    public void lastName() {
        System.out.println("wu");
    }

    @Override
    public void idCard() {
        System.out.println("3303");
    }
}
