package cn.txx.ch8_2.web;

import cn.txx.ch8_2.dao.PersonRepository2;
import cn.txx.ch8_2.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/30
 */
@RestController
public class DataController2 {
    @Autowired(required = false)
    PersonRepository2 personRepository2;
    @RequestMapping("/auto")
    public Page<Person> auto(Person person){
        Page<Person> byAuto = personRepository2.findByAuto(person, PageRequest.of(0, 10));
        return byAuto;
    }
}
