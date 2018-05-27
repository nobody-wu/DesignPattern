package responsibilitychain;

import java.util.Objects;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 23:00 2018/5/27
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    void requestApplications(Request request) {
        if (Objects.equals(request.getRequestType(), "涨薪") && request.getNumber() <= 5){
            System.out.println(getName()+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }else {
            //申请转向上级
            getSuperior().requestApplications(request);
        }
    }
}
