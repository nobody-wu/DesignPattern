package bridge.better;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 12:02 2018/8/21
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation(){
        implementor.operation();
    }

}
