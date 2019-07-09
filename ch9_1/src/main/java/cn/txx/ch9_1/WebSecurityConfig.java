package cn.txx.ch9_1;

import cn.txx.ch9_1.security.CustomPasswordEncoder;
import cn.txx.ch9_1.security.CustomUserService;
import com.sun.tracing.ProbeName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/8
 */

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService(){ //2
        return new CustomUserService();
    }
    @Bean
    CustomPasswordEncoder passwordEncoder(){
        return new CustomPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService()).passwordEncoder(passwordEncoder()); //3

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/static/**","/css/**").permitAll()
                .anyRequest().authenticated() //4
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error")
                .permitAll() //5
                .and()
                .logout().permitAll(); //6
        http
                .csrf().disable().cors().disable();
    }


    /*
    * 不拦截静态资源
    * */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**").and().ignoring().antMatchers("/css/**");
    }
}
