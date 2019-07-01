package cn.txx.ch8_2.web;

import cn.txx.ch8_2.dao.PersonRepository;
import cn.txx.ch8_2.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/30
 */
@RestController
public class DataController {
    @Autowired(required = false)
    PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(String name,int age,String address){
        Person p = personRepository.save(new Person(null,name,age,address));
        return p;
    }
    @RequestMapping("/q1")
    public List<Person> q1(String address){
        List<Person> personList = personRepository.findByAddress(address);
        return personList;
    }

    /**
     * 测试findByNameAndAddress
     */
    @RequestMapping("/q2")
    public Person q2(String name,String address){
        Person byNameAndAddress = personRepository.findByNameAndAddress(name, address);
        return byNameAndAddress;
    }

    /**
     * 测试withNameAndAddressQuery
     */
    @RequestMapping("/q3")
    public Person q3(String name,String address){
        Person p = personRepository.withNameAndAddressQuery(name, address);
        return p;
    }

    /**
     * 测试withNameAndAddressNamedQuery
     */
    @RequestMapping("/q4")
    public Person q4(String name,String address){
        Person p = personRepository.withNameAndAddressNamedQuery(name, address);
        return p;
    }

    /**
     * 测试排序
     */
    @RequestMapping("/sort")
    public List<Person> sort(){
        Iterable<Person> peoples = personRepository.findAll(new Sort(Sort.Direction.ASC, "age"));
        List<Person> personList = new ArrayList<>();
        peoples.forEach((te)->{
            personList.add(te);
        });
        return personList;
    }

    /**
     * 测试分页
     */
    @RequestMapping("/page")
    public Page<Person> page(){
        Page<Person> pagePeople = personRepository.findAll(PageRequest.of(1, 2));
        return pagePeople;
    }
}
