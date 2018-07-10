package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wujiapeng
 * @Description: 具体聚合类
 * @Date: created in 16:46 2018/7/10
 */
public class ConcreateAggregate implements Aggregate {

    private List<Object> list = new ArrayList<>();

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public ConcreateAggregate(List<Object> list) {
        this.list = list;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }
}
