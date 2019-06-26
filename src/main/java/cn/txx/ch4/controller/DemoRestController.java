package cn.txx.ch4.controller;

import cn.txx.ch4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/25
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value = "/getjson",produces = {"application/json;charset=UTF-8"})
    public DemoObj getJson(DemoObj obj){
        return new DemoObj(obj.getId() + 1,obj.getName()+"yyy");
    }

    @RequestMapping(value = "/getxml",produces = {"application/xml;charset=UTF-8"})
    public DemoObj getXml(DemoObj obj){
        return new DemoObj(obj.getId() + 1,obj.getName()+"yyy");
    }
}
