package factoryMethod;

/**
 * @Author: wujiapeng
 * @Description: 加法工厂
 * @Date: created in 15:12 2018/7/9
 */
public class AddOperationFactory implements OperationFactory {

    private Float a,b;

    public AddOperationFactory(Float a, Float b) {
        this.a = a;
        this.b = b;
    }

    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

    public Float getB() {
        return b;
    }

    public void setB(Float b) {
        this.b = b;
    }

    @Override
    public OperationFactory createOperationFactory(Float a, Float b) {
        return new AddOperationFactory(a, b);
    }

    @Override
    public Float getResult() {
        return a + b;
    }


}
