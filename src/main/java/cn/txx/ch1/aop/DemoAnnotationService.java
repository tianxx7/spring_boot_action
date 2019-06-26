package cn.txx.ch1.aop;

import org.springframework.stereotype.Service;

/* *
 * 描述: 使用注解   被拦截的类
 * @user tianxinxing
 * @date 2019/6/22
 */
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截add操作")
    public void add(){}
}
