package factoryMethod;

/**
 * @Author: wujiapeng
 * @Description: 算法工厂接口
 * @Date: created in 15:12 2018/7/9
 */
public interface OperationFactory {

    OperationFactory createOperationFactory(Float a, Float b);

    Float getResult();
}
