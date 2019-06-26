package cn.txx.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/* *
 * 描述: aop配置类
 * @user tianxinxing
 * @date 2019/6/22
 */
@Configuration
@ComponentScan(basePackages = {"cn.txx.ch1.aop"})
@EnableAspectJAutoProxy  //开启aop代理
public class AopConfig {
}
