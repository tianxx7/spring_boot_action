package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/7
 */
@Controller
@RequestMapping
public class MainController {

    @RequestMapping("/usersLogin")
    public String login(){
        return "login";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
