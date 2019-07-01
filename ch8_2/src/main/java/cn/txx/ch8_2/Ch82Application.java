package cn.txx.ch8_2;

import cn.txx.ch8_2.dao.PersonRepository2;
import cn.txx.ch8_2.support.CustomRepositoryFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"cn.txx.ch8_2"},repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
public class Ch82Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Ch82Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch82Application.class, args);
	}

}
