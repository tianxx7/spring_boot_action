package cn.txx.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executorAsyncTaskPush(i);
        }
        context.close();
    }
}
