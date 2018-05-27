package responsibilitychain;

/**
 * @Author: wujiapeng
 * @Description: 管理者抽象类
 * @Date: created in 22:43 2018/5/27
 */
public abstract class Manager {

    private String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 声明上级
     * @param manager
     */
    public void setSuperior(Manager manager){
        this.superior = manager;
    }

    public Manager getSuperior(){
        return this.superior;
    }

    /**
     * 添加到责任链
     * @param request
     */
    abstract void requestApplications(Request request);
}
