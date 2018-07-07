package simplefactory.factory;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 17:59 2018/7/6
 */
public class OperationAdd extends OperationFactory implements Operation {

    public OperationAdd(float a, float b) {
        super(a, b);
    }

    @Override
    public Float getReult() {
        return super.getA() + super.getB();
    }
}
