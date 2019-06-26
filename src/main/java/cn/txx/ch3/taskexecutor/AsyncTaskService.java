package cn.txx.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer integer){
        System.out.println("执行异步任务:"+integer);
    }

    @Async
    public void executorAsyncTaskPush(Integer integer){
        System.out.println("执行异步任务+1:"+(integer+1));
    }
}
