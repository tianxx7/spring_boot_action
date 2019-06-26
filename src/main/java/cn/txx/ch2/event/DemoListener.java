package cn.txx.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/* *
 * 描述: 事件监听器
 * @user tianxinxing
 * @date 2019/6/22
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:"+msg);
    }
}
