package bridge.better;

/**
 * @Author: wujiapeng
 * @Description: 之前展示的是业务需求上的桥接模式，这里展示功能上的桥接，主要是拆分抽象类和具体实现类的隔离
 * @Date: created in 11:53 2018/8/21
 */
public class Main {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();
    }
}
