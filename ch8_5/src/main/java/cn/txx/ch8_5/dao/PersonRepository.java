package cn.txx.ch8_5.dao;

import cn.txx.ch8_5.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
	

}
