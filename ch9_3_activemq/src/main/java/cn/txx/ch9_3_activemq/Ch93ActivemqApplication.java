package cn.txx.ch9_3_activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class Ch93ActivemqApplication implements CommandLineRunner {
	@Autowired
	JmsTemplate jmsTemplate; //2

	public static void main(String[] args) {
		SpringApplication.run(Ch93ActivemqApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
		System.out.println(System.currentTimeMillis());
		Thread.sleep(5000);
        jmsTemplate.send("my-destination", new Msg()); //3
    }
}
