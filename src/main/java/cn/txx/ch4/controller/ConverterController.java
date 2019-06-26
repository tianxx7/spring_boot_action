package cn.txx.ch4.controller;

import cn.txx.ch4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* *
 * 描述: 自定义content-type
 * @user tianxinxing
 * @date 2019/6/26
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert",produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj obj) {
        return obj;
    }
}
