package cn.txx.ch2.prepost;

/* *
 * 描述: 使用@Bean的形式,Java配置形式
 * @user tianxinxing
 * @date 2019/6/22
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        System.out.println("初始化构造函数-BenaWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
