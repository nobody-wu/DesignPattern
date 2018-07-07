package simplefactory.factory;

/**
 * @Author: wujiapeng
 * @Description: 运算工厂类
 * @Date: created in 17:57 2018/7/6
 */
public class OperationFactory {

    private float a,b;

    public OperationFactory(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public Operation operation(String operation){
        switch (operation){
            case "+" : return new OperationAdd(a, b);
            default:
        }
        return null;
    }

}
