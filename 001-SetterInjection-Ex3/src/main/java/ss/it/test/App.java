package ss.it.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ss.it.beans.UIDAI;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// locate and hold spring bean cfg file
		FileSystemResource resource = new FileSystemResource("src/main/java/ss/it/cfgs/applicationContext.xml");

		// create spring ioc container
		BeanFactory factory = new XmlBeanFactory(resource);

		// create spring bean class object
		Object object = factory.getBean("uid");

		// cast the object to spring bean class
		UIDAI uidai = (UIDAI) object;

		// call the b.logic
		System.out.println(uidai.toString());
	}
}
