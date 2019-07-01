package cn.txx.ch8_2.dao;

import cn.txx.ch8_2.domain.Person;
import cn.txx.ch8_2.support.CustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/30
 */
public interface PersonRepository2 extends CustomRepository<Person, Long> {
    List<Person> findByAddress(String address);

    Person findByNameAndAddress(String name, String address);

    @Query("select p from Person p where p.name= :name and p.address= :address")
    Person withNameAndAddressQuery(@Param("name") String name, @Param("address") String address);

    Person withNameAndAddressNamedQuery(String name, String address);

}
