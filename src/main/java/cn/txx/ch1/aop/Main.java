package cn.txx.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/22
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService methodService = context.getBean(DemoMethodService.class);
        DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
        methodService.add();
        annotationService.add();
        context.close();
    }
}
