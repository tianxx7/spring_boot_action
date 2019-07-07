package cn.txx.ch4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/7
 */
@Controller
public class LoginController {

    @RequestMapping("/userlogin")
    public String login(){
        return "home";
    }
}
