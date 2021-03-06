package cn.txx.ch9_3_activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@JmsListener(destination = "my-destination") //1
	public void receiveMessage(String message) {
		System.out.println(System.currentTimeMillis());
		System.out.println("接受到: <" + message + ">");
	}
}
