package cn.txx.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
