package cn.txx.ch3.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


/* *
 * 描述: 直接导入配置类
 * @user tianxinxing
 * @date 2019/6/23
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(SchedulingConfiguration.class)
@Documented
public @interface EnableScheduling {
}
