package cn.txx.ch4;

import cn.txx.ch4.domain.MyPasswordEncoder;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/3
 */
@Configuration
@EnableWebSecurity
public class MySecutiryConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //缺了这一行会报错
        //http.authorizeRequests().anyRequest().authenticated();
        http.authorizeRequests()
                .anyRequest().authenticated()
        .and().formLogin()
                .loginPage("/userLogin")
                .defaultSuccessUrl("/list")
                .failureUrl("/login?error")
                .permitAll()
                .and()
                .rememberMe()
                .tokenValiditySeconds(1209600)
                .and().logout().permitAll(); //cookie有效期 2周
        http.csrf().disable();
    }

    //4
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder())
                .withUser("txx").password("123").roles("USER");
    }

    //5忽略静态资源的拦截
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/static/**");
    }
}
