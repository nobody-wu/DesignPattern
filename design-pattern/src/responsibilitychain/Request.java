package responsibilitychain;

/**
 * @Author: wujiapeng
 * @Description: 提出请求
 * @Date: created in 22:45 2018/5/27
 */
public class Request {

    private String requestType;

    private String requestContent;

    private int number;

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
}
