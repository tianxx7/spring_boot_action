package cn.txx.ch8_2.specs;

import static com.google.common.collect.Iterables.toArray;

import cn.txx.ch8_2.domain.Person;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.SingularAttribute;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/30
 */
public class CustomerSpecs {

    //1  定义一个返回值为Specification的方法byAuto,这里使用泛型,
    public static <T> Specification<T> byAuto(final EntityManager entityManager, final T example) {

        final Class<T> type = (Class<T>) example.getClass();//2 获得当前实体类对象类的类型

        return new Specification<T>() {

            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>(); //3 新建Predicate列表存储构造的查询条件

                EntityType<T> entity = entityManager.getMetamodel().entity(type);//4 获得实体类的EntityType,可以从entityType获得实体类的属性

                for (Attribute<T, ?> attr : entity.getDeclaredAttributes()) {//5 对实体类的所有属性做循环
                    Object attrValue = getValue(example, attr); //6获得实体类的某一个属性
                    if (attrValue != null) {
                        if (attr.getJavaType() == String.class) { //7  当前属性值为字符类型的情况
                            if (!StringUtils.isEmpty(attrValue)) { //8  若当前字符不为空的情况
                                predicates.add(cb.like(root.get(attribute(entity, attr.getName(), String.class)),
                                        pattern((String) attrValue))); //9 构造当前属性like(前后%)属性查询条件
                            }
                        } else {
                            predicates.add(cb.equal(root.get(attribute(entity, attr.getName(), attrValue.getClass())),
                                    attrValue)); //10
                        }
                    }

                }
                return predicates.isEmpty() ? cb.conjunction() : cb.and(toArray(predicates, Predicate.class));//11
            }

            /**
             * 12
             */
            private <T> Object getValue(T example, Attribute<T, ?> attr) {
                return ReflectionUtils.getField((Field) attr.getJavaMember(), example);
            }

            /**
             * 13
             */
            private <E, T> SingularAttribute<T, E> attribute(EntityType<T> entity, String fieldName,
                                                             Class<E> fieldClass) {
                return entity.getDeclaredSingularAttribute(fieldName, fieldClass);
            }

        };

    }

    /**
     * 14
     */
    static private String pattern(String str) {
        return "%" + str + "%";
    }

    /*
    查出所有来自合肥的人
     */
    public static Specification<Person> personFromHefei(){
        return new Specification<Person>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<Person> root,
                                         CriteriaQuery<?> criteriaQuery,
                                         CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("address"),"合肥");
            }
        };
    }
}
