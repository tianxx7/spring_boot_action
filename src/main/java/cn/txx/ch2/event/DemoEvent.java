package cn.txx.ch2.event;

import org.springframework.context.ApplicationEvent;

/* *
 * 描述: 自定义事件
 * @user tianxinxing
 * @date 2019/6/22
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
