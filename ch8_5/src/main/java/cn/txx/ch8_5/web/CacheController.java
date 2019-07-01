package cn.txx.ch8_5.web;

import cn.txx.ch8_5.domain.Person;
import cn.txx.ch8_5.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class CacheController {
	
	@Autowired
	DemoService demoService;
	
	
	
	
	@RequestMapping("/put")
	public Person put(Person person){
		return demoService.save(person);
	}

	
	@RequestMapping("/able")
	public Person cacheable(Person person){
		Optional<Person> one = demoService.findOne(person);
		Person person1 = one.orElse(null);
		return person1;
	}
	
	@RequestMapping("/evit")
	public String  evit(Long id){
		 demoService.remove(id);
		 return "ok";
	}
}
