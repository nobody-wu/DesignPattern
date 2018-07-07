package simplefactory;

/**
 * @Author: wujiapeng
 * @Description: 坏代码
 * @Date: created in 17:26 2018/7/6
 */
public class BadCode {

    /**
     * 实现一个计算器的代码
     * @param args
     */
    public static void main(String[] args) {
        InputNumA inputNumA = new InputNumA(1.0f);
        InputNumB inputNumB = new InputNumB(2.0f);
        Operation operation = new Operation("/");

        Float result = 0.0f;

        switch (operation.getOperation()){
            case "*" : result = inputNumA.getNum() * inputNumB.getNum();break;
            case "+" : result = inputNumA.getNum() + inputNumB.getNum();break;
            case "-" : result = inputNumA.getNum() - inputNumB.getNum();break;
            case "/" : result = inputNumA.getNum() / inputNumB.getNum();break;
            default:
        }

        System.out.println(result);
    }

}
