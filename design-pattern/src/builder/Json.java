package builder;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 17:36 2018/7/9
 */
public class Json extends PersonBuilder {
    @Override
    public void firstName() {
        System.out.println("xukai");
    }

    @Override
    public void lastName() {
        System.out.println("wang");
    }

    @Override
    public void idCard() {
        System.out.println("4404");
    }
}
