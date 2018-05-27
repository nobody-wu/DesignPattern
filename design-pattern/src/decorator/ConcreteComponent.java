package decorator;

/**
 * @Author: wujiapeng
 * @Description: 定义对象基本操作
 * @Date: created in 16:50 2018/5/27
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象操作");
    }
}
