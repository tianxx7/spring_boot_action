package cn.txx.ch8_4.service;


import cn.txx.ch8_4.domain.Person;

public interface DemoService {
	public Person savePersonWithRollBack(Person person);
	public Person savePersonWithoutRollBack(Person person);

}
