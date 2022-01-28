package ss.it.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import ss.it.beans.UIDAI;

public class App2 {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// locate and hold spring bean cfg file
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");

		// create spring ioc container
		BeanFactory factory = new XmlBeanFactory(resource);

		// get target spring bean class object
		UIDAI uidai =factory.getBean("uid",UIDAI.class);

		// call the b.logic
		System.out.println("hello world " +uidai.toString());
	}
}
