package builder;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 17:39 2018/7/9
 */
public class PersonDirector extends PersonBuilder {

    private PersonBuilder personBuilder;

    public PersonBuilder getPersonBuilder() {
        return personBuilder;
    }

    public void setPersonBuilder(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    /**
     * 自定义建造过程
     */
    public void getResult(){
        personBuilder.firstName();
        personBuilder.lastName();
        personBuilder.idCard();
    }


    @Override
    public void firstName() {
        personBuilder.firstName();
    }

    @Override
    public void lastName() {
        personBuilder.lastName();
    }

    @Override
    public void idCard() {
        personBuilder.idCard();
    }
}
