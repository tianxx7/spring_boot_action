package cn.txx.ch7;

import org.springframework.boot.context.properties.ConfigurationProperties;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/28
 */
//@ConfigurationProperties("spring.thymeleaf")
public class ThymeleafProperties {
    public static final String DEFAULT_PREFIX = "classpath:/templates";
    public static final String DEFAULT_SUFFIX = ".html";

    /*
    * 前缀设置
    * */
    private String prefix = DEFAULT_PREFIX;

    /*
    * 后缀设置,默认为html
    * */
    private String suffix = DEFAULT_SUFFIX;

    /*
    * 模板模式设置,默认为HTML 5
    * */
    private String mode = "HTML5";

    /*
    * 模板的编码设置,默认为UTF-8
    * */
    private String encoding = "UTF-8";

    /*
    * 模板的媒体类型设置,默认为text/html
    * */
    private String contentType = "text/html";

    /*
    * 是否开启模板缓存,默认开启,开发时关闭
    * */
    private boolean cache = false;
}
