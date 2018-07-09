package proxy;

/**
 * @Author: wujiapeng
 * @Description: 追求者代理
 * @Date: created in 14:21 2018/7/9
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void fiveChocolate() {
        pursuit.fiveChocolate();
    }
}
