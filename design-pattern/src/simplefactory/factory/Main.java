package simplefactory.factory;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 13:33 2018/7/7
 */
public class Main {

    public static void main(String[] args) {
        Float a = 1.0f;
        Float b = 2.0f;
        OperationFactory operationFactory = new OperationFactory(a, b);
        System.out.println(operationFactory.operation("+").getReult());
    }

}
