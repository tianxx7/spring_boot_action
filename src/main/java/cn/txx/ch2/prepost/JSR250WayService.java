package cn.txx.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/22
 */
public class JSR250WayService {

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
