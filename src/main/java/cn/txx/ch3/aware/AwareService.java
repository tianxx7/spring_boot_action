package cn.txx.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {
    String beanName;
    ResourceLoader loader;
    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("bean的名称为:"+beanName);
        Resource resource = loader.getResource("classpath:cn/txx/ch3/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容是:"+ IOUtils.toString(resource.getInputStream(),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
