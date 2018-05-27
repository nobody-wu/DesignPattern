package decorator;

/**
 * @Author: wujiapeng
 * @Description:
 *
 * 装饰者模式：
 * 动态地给一个对象添加一些额外的职责，比如增加功能。为了已有功能动态地添加更多功能的一种方式。
 * 简单来说就是，为了使得当前对象做了一些额外的不属于他本身的事情。
 *
 * 场景：当系统需要新功能的时候，是向旧的类中添加的代码。这些新加的代码通常装饰了原有类的核心职责或主要行为。
 *
 * 优点：有效地把类的核心职责和装饰功能区分开了，而且可以去除相关类中重复的装饰逻辑。
 * 我们原来的"装饰逻辑"其实就是简单的set对象属性，比如一个人要穿衣服裤子，我们只会set裤子属性、set衣服属性到人这个对象中，
 * 但是如果需要拓展人的这个对象属性，要开始穿外套了，这样代码重构就会很繁琐，使用装饰模式，把装饰功能区分开，在不影响原有的代码基础上，新增装饰对象。
 *
 *
 * @Date: created in 16:52 2018/5/27
 */
public class Main {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        // 利用setComponent进行对象包装，使得每个装饰对象的实现方法和如果使用这个对象分开，
        // 每个装饰对象只需要关心自己的功能，不需要关心什么时候添加到对象链中。
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);

        concreteDecoratorB.operation();
    }
}
