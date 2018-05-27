package decorator;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 16:54 2018/5/27
 */
public class ConcreteDecoratorB extends Decorator{

    public void operation(){
        super.operation();
        System.out.println("do something");
        System.out.println("具体装饰对象B的操作");
    }
}
