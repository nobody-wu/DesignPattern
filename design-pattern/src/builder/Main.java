package builder;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 17:37 2018/7/9
 */
public class Main {

    /**
     * 建造者模式：
     * 主要用于创建一些复杂的对象，这些对象内部的构建通常面临着复杂的变化，但是这些对象内部构建间的建造顺序通常是稳定的。（kfc这种流程定制的快餐）
     *
     * 当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时适用的模式
     *
     * 好处：
     *  使得建造代码和表示代码分离。
     *
     *  @param args
     */
    public static void main(String[] args) {

        // 坏味道代码
        PersonBuilder personBuilder = new Tom();
        personBuilder.firstName();
        personBuilder.idCard();
        personBuilder.lastName();

        PersonBuilder personBuilder2 = new Json();
        personBuilder2.firstName();
        personBuilder2.idCard();
        personBuilder2.lastName();

        System.out.println("------");

        // 添加指挥者
        PersonDirector personDirector = new PersonDirector(personBuilder);
        personDirector.idCard();
        personDirector.firstName();
        personDirector.lastName();

        System.out.println("------");

        // 自定义建造过程
        PersonDirector personDirector1 = new PersonDirector(personBuilder);
        personDirector1.getResult();

    }

}
