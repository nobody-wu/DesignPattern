package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 16:53 2018/7/10
 */
public class Main {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("wjp");
        list.add("wxk");
        ConcreateAggregate concreateAggregate = new ConcreateAggregate(list);
        // 跟工厂方法一样，以防有不同的迭代器
        Iterator iterator = concreateAggregate.createIterator();
        System.out.println(iterator.first());
        System.out.println(iterator.next());
        System.out.println(iterator.isDone());
    }
}
