package cn.txx.ch4.dao;

import cn.txx.ch4.domain.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/2
 */
@Repository
public interface IPersonMapper {

    @Select("select * from person")
    List<Person> findAll();
}
