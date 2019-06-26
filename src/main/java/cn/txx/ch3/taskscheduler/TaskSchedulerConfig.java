package cn.txx.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
@Configuration
@ComponentScan("cn.txx.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
