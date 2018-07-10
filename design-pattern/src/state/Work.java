package state;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 20:14 2018/7/9
 */
public class Work {

    private State state;

    private Integer hour;


    public Work(State state) {
        this.state = state;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeProgram() {
        state.writeProgram(this);
    }
}
