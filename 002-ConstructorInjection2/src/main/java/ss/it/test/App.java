package ss.it.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ss.it.beans.WishMessageGenerator;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// create resorce object
		FileSystemResource resource = new FileSystemResource("src/main/java/ss/it/cfgs/applicationContext.xml");

		// create Beanfactory container
		BeanFactory factory = new XmlBeanFactory(resource);

		// call the container to create the spring bean class object
		WishMessageGenerator mess = (WishMessageGenerator) factory.getBean("wmg");

		// call business method
		System.out.println(mess.toString());

	}
}
