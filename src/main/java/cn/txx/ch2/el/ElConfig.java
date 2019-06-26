package cn.txx.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/22
 */
@Configuration
@ComponentScan("cn.txx.ch2.el")
@PropertySource("classpath:cn/txx/ch2/el/test.properties")
public class ElConfig {

    @Value("i love you")
    private String normal;

    //获取系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //获取
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    //注入其他bean属性
    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:cn/txx/ch2/el/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream(),"UTF-8"));
            System.out.println(IOUtils.toString(testUrl.getInputStream(),"UTF-8"));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
