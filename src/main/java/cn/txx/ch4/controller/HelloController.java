package cn.txx.ch4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/24
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
