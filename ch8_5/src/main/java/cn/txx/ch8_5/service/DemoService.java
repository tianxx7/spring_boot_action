package cn.txx.ch8_5.service;


import cn.txx.ch8_5.domain.Person;

import java.util.Optional;

public interface DemoService {
	public Person save(Person person);
	
	public void remove(Long id);
	
	public Optional<Person> findOne(Person person);

}
