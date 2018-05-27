package subjectTobserver.event;

import subjectTobserver.Subject;

import java.util.Date;

/**
 * @Author: wujiapeng
 * @Description: 去除观察者接口，进一步解耦
 * @Date: created in 22:36 2018/5/22
 */
public class StockObserver {
    private String id;

    private String name;

    private Subject subject;

    public StockObserver(String id, String name) {
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

    public void handleStock(Date date) {
        System.out.println("test,id:" + id + ",name:" + name + ",data:"+date);
    }
}
