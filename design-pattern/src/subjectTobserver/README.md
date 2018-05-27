## 观察者模式（发布-订阅模式）：
 * 目的：解耦,让耦合的双方依赖于抽象（接口），而不是具体的实现，从而使得各自的变化不会影响另外一边
 * 场景：
    1. 当一个对象的改变需要同时改变其他对象(不知道具体有哪些对象需要改变)，需要考虑观察者模式
    2. 当一个抽象模式有两个方面，其中一个方面依赖于另外一个方面，用观察者模式可以将这两者封装在独立的对象中，使各自独立地改变和复用
 * 缺点：观察者的接口要统一，这个在实际开发中往往比较难做到
 * 
 * 处理：c#中有事件委托，方法倒挂的功能。java中可以使用反射去实现![优化](https://github.com/sunnyWu1104/DesignPattern/tree/master/design-pattern/src/subjectTobserver/event)
 *
 * 实际案例：guava eventbus

![观察者模式](http://p95stksgt.bkt.clouddn.com/%E8%A7%82%E5%AF%9F%E8%80%85%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F.jpeg)

