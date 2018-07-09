package proxy;

/**
 * @Author: wujiapeng
 * @Description: 追求者
 * @Date: created in 14:34 2018/7/9
 */
public class Pursuit implements GiveGift {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println("送" + schoolGirl.getName() + "娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("送" + schoolGirl.getName() + "花");
    }

    @Override
    public void fiveChocolate() {
        System.out.println("送" + schoolGirl.getName() + "巧克力");
    }
}
