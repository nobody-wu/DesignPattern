package decorator;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 16:52 2018/5/27
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    public void operation(){
        super.operation();
        addedState = "new State";
        System.out.println("具体装饰对象A的操作");
    }

}
