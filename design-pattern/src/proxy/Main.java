package proxy;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 14:22 2018/7/9
 */
public class Main {

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("oldKing");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.fiveChocolate();
        proxy.giveFlowers();
    }
}
