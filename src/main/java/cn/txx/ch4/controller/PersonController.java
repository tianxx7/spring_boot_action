package cn.txx.ch4.controller;

import cn.txx.ch4.dao.IPersonMapper;
import cn.txx.ch4.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/2
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    IPersonMapper mapper;

    @RequestMapping(value = "/get",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Person> get(){
        return mapper.findAll();
    }
}
