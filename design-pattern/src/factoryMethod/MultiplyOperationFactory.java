package factoryMethod;

/**
 * @Author: wujiapeng
 * @Description: 乘法工厂
 * @Date: created in 15:13 2018/7/9
 */
public class MultiplyOperationFactory implements OperationFactory {
    private Float a,b;

    public MultiplyOperationFactory(Float a, Float b) {
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
        return new MultiplyOperationFactory(a, b);
    }

    @Override
    public Float getResult() {
        return a * b;
    }
}
