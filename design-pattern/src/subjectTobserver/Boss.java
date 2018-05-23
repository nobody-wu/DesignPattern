package subjectTobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 22:32 2018/5/22
 */
public class Boss implements Subject {

    private String action;

    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifies() {
        observerList.forEach(Observer::update);
    }

    @Override
    public String getSubjectStatus() {
        return action;
    }

    @Override
    public void setSubjectStatus(String value) {
        action = value;
    }
}
