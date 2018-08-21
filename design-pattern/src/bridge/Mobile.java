package bridge;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 11:50 2018/8/21
 */
public class Mobile {
    private MobileType mobileType;
    private Soft soft;

    public Mobile(MobileType mobileType, Soft soft) {
        this.mobileType = mobileType;
        this.soft = soft;
    }

    public MobileType getMobileType() {
        return mobileType;
    }

    public void setMobileType(MobileType mobileType) {
        this.mobileType = mobileType;
    }

    public Soft getSoft() {
        return soft;
    }

    public void setSoft(Soft soft) {
        this.soft = soft;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileType=" + mobileType +
                ", soft=" + soft +
                '}';
    }

    public void run(){
        mobileType.run();
        soft.function();
    }
}
