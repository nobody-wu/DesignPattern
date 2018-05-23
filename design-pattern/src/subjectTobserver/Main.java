package subjectTobserver;

/**
 * 观察者模式（发布-订阅模式）：
 * 目的：解耦,让耦合的双方依赖于抽象（接口），而不是具体的实现，从而使得各自的变化不会影响另外一边
 * 场景：
 * 1、当一个对象的改变需要同时改变其他对象(不知道具体有哪些对象需要改变)，需要考虑观察者模式
 * 2、当一个抽象模式有两个方面，其中一个方面依赖于另外一个方面，用观察者模式可以将这两者封装在独立的对象中，使各自独立地改变和复用
 *
 * 缺点：观察者的接口要统一，这个在实际开发中往往比较难做到
 *
 * 实际案例：guava eventbus
 */
public class Main {

    public static void main(String[] args) {
        Subject boss = new Boss();
        Observer stockObserver1 = new StockObserver("1", "zhangsan", boss);
        Observer stockObserver2 = new StockObserver("2", "lisi", boss);
        Observer stockObserver3 = new StockObserver("3", "wangwu", boss);

        boss.attach(stockObserver1);
        boss.attach(stockObserver2);
        boss.detach(stockObserver3);

        boss.setSubjectStatus("boss is comming...");
        boss.notifies();
    }
}
