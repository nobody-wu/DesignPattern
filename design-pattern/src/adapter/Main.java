package adapter;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 14:50 2018/7/10
 */
public class Main {

    public static void main(String[] args) {
        Player a = new Forwards("TOM");
        a.Defense();

        Player json = new Center("JSON");
        json.Attack();

        Player ym = new Translator("姚明");
        ym.Attack();
        ym.Defense();

    }
}
