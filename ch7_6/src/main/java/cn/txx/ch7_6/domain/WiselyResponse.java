package cn.txx.ch7_6.domain;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/29
 */
public class WiselyResponse {
    private String responseMessage;
    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
