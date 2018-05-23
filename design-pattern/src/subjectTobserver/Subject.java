package subjectTobserver;

/**
 * @Author: wujiapeng
 * @Description: 通知者接口
 * @Date: created in 22:28 2018/5/22
 */
public interface Subject {
    /**
     * 增加观察者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 减少观察者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知
     */
    void notifies();

    String getSubjectStatus();

    void setSubjectStatus(String value);

}
