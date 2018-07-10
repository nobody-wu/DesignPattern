package adapter;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 14:44 2018/7/10
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void Attack();

    public abstract void Defense();
}
