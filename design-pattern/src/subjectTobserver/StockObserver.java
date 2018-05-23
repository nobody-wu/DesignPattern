package subjectTobserver;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 22:36 2018/5/22
 */
public class StockObserver implements Observer {
    private String id;

    private String name;

    private Subject subject;

    public StockObserver(String id, String name, Subject subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if ("boss is comming...".equals(subject.getSubjectStatus())){
            System.out.println("test,id:" + id + ",name:" + name + ",subjectStatus:" + subject.getSubjectStatus());
        }
    }
}
