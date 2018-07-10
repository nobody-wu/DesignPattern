package Iterator;

import java.util.List;

/**
 * @Author: wujiapeng
 * @Description: 具体迭代器类
 * @Date: created in 16:45 2018/7/10
 */
public class ConcreteIterator implements Iterator {

    private List<Object> concreateAggregateList;

    private int current = 0;

    public ConcreteIterator(List<Object> concreateAggregateList) {
        this.concreateAggregateList = concreateAggregateList;
    }

    @Override
    public Object first() {
        return concreateAggregateList.get(0);
    }

    @Override
    public Object next() {
        Object o = null;
        current++;
        if (current < concreateAggregateList.size()) {
            o = concreateAggregateList.get(current);
        }
        return o;
    }

    @Override
    public boolean isDone() {
        return current >= concreateAggregateList.size();
    }

    @Override
    public Object currentItem() {
        return concreateAggregateList.get(current);
    }
}
