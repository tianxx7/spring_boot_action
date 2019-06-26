package cn.txx.ch3.taskscheduler;

import cn.txx.ch3.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

    }
}
