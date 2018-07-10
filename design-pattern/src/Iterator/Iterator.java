package Iterator;

/**
 * @Author: wujiapeng
 * @Description: 迭代器接口
 * @Date: created in 16:44 2018/7/10
 */
public interface Iterator {
    Object first();

    Object next();

    boolean isDone();

    Object currentItem();
}
