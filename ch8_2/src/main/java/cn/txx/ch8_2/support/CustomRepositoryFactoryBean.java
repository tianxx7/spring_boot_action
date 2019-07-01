package cn.txx.ch8_2.support;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.*;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;
import java.io.Serializable;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/30
 */
public class CustomRepositoryFactoryBean<R extends JpaRepository<T, ID>, T, ID extends Serializable>
        extends JpaRepositoryFactoryBean<R, T, ID>{


    public CustomRepositoryFactoryBean(Class<? extends R> repositoryInterface) {
        super(repositoryInterface);
    }

    @Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {// 2
        return new CustomRepositoryFactory(entityManager);
    }

    private static class CustomRepositoryFactory<T,ID extends Serializable> extends JpaRepositoryFactory {// 3
        private final EntityManager em;
        public CustomRepositoryFactory(EntityManager entityManager) {
            super(entityManager);
            this.em = entityManager;
        }

        @Override
        protected JpaRepositoryImplementation<?, ?> getTargetRepository(RepositoryInformation information, EntityManager entityManager) {
            return new CustomRepositoryImpl<>((Class<T>)information.getDomainType(),entityManager);
        }

        /*@Override
        protected Object getTargetRepository(RepositoryInformation information) {
            return new CustomRepositoryImpl<T,ID>((Class<T>)information.getDomainType(),em);
        }*/

        @Override
        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {// 5
            return CustomRepositoryImpl.class;
        }
    }
}
