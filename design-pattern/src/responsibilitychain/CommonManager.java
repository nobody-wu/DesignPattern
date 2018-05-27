package responsibilitychain;

import java.util.Objects;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 22:50 2018/5/27
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    void requestApplications(Request request) {
        if (Objects.equals(request.getRequestType(), "请假") && request.getNumber() <= 2){
            System.out.println(getName()+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }else {
            //申请转向上级
            getSuperior().requestApplications(request);
        }

    }
}
