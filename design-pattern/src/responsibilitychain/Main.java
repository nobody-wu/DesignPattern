package responsibilitychain;

/**
 * @Author: wujiapeng
 * @Description: 责任设计模式
 * @Date: created in 23:01 2018/5/27
 */
public class Main {

    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("wjp");
        GeneralManager generalManager = new GeneralManager("wxk");
        //设置上级
        commonManager.setSuperior(generalManager);

        Request request1 = new Request();
        request1.setNumber(1);
        request1.setRequestContent("wjp请假");
        request1.setRequestType("请假");

        Request request2 = new Request();
        request2.setRequestType("涨薪");
        request2.setRequestContent("wxk涨薪");
        request2.setNumber(4);

        commonManager.requestApplications(request1);
        commonManager.requestApplications(request2);
    }
}
