package cn.txx.ch3.annotation;

import org.springframework.stereotype.Service;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获取的bean");
    }
}
