package cn.txx.ch8_2.support;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

import static cn.txx.ch8_2.specs.CustomerSpecs.*;


/**
 * @param <T>
 * @param <ID>
 */
/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/30
 */
public class CustomRepositoryImpl<T,ID extends Serializable> extends SimpleJpaRepository<T,ID>
        implements CustomRepository<T,ID> {

    @PersistenceContext
   private final EntityManager entityManager;
    private Class<T> entityClass;

   public CustomRepositoryImpl(Class<T> domainClass,EntityManager entityManager){
        super(domainClass,entityManager);
       System.out.println("构造函数");
       this.entityManager = entityManager;
       this.entityClass = domainClass;
   }


    @Override
    public Page<T> findByAuto(T example, Pageable pageable) {
        return findAll(byAuto(entityManager, example),pageable);
    }
}












