package adapter;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 14:51 2018/7/10
 */
public class Translator extends Player {

    private Player player;

    public Translator(String name) {
        super(name);
        player = new Center(name);
    }

    public void Attack() {
        System.out.println("翻译后。。。。");
        player.Attack();
    }

    public void Defense() {
        System.out.println("翻译后。。。。");
        player.Defense();
    }
}
