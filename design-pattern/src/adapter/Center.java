package adapter;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 14:46 2018/7/10
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("中峰"+super.name+"进攻");
    }

    @Override
    public void Defense() {
        System.out.println("中峰"+super.name+"防守");
    }
}
