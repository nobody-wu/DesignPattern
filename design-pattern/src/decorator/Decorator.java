package decorator;

/**
 * @Author: wujiapeng
 * @Description: 装饰者抽象类
 * @Date: created in 16:50 2018/5/27
 */
public abstract class Decorator implements Component {
    private Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    /**
     * 实际上执行的是Component的方法
     */
    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }

}
