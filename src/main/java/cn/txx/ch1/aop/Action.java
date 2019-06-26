package cn.txx.ch1.aop;

import java.lang.annotation.*;

/* *
 * 描述: aop拦截规则
 * @user tianxinxing
 * @date 2019/6/22
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
