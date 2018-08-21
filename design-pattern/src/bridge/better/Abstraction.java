package bridge.better;

/**
 * @Author: wujiapeng
 * @Description: 抽象类
 * @Date: created in 12:01 2018/8/21
 */
public abstract class Abstraction {

    public Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();

}
