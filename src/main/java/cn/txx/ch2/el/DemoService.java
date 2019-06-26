package cn.txx.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/* *
 * 描述: 需要被注入的bean
 * @user tianxinxing
 * @date 2019/6/22
 */
@Service
public class DemoService {
    @Value("其他类的属性")  //此处注入为普通字符串
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
