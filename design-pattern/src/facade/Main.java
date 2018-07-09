package facade;

/**
 * @Author: wujiapeng
 * @Description: 外观模式
 * @Date: created in 17:02 2018/7/9
 */
public class Main {

    /**
     * 其实外观模式，与mvc分层思想类似的，把内部功能进行封装，对外只是暴露其中的接口，减少之间的依赖。
     *
     * 在代码可读性上也很有好处
     *
     * @param args
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        System.out.println("-----");
        facade.methodB();
    }
}
