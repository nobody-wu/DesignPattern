package facade;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 17:00 2018/7/9
 */
public class Facade {

    private MethodA a;
    private MethodB b;

    public Facade() {
        a = new MethodA();
        b = new MethodB();
    }

    public void methodA(){
        a.method();
        b.method();
    }

    public void methodB(){
        b.method();
    }
}
