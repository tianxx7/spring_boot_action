package cn.txx.ch2.profile;

import org.springframework.web.WebApplicationInitializer;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/22
 */
public class WebInit implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext container) throws ServletException {
        container.setInitParameter("spring.profiles.default","dev");
    }
}
