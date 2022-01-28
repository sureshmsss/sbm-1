package ss.it.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ss.it.beans.WishMsg;

public class Test {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		FileSystemResource resource = new FileSystemResource("src/main/java/ss/it/cfgs/applicationContext.xml");

		// create a bean factory container
		BeanFactory factory = new XmlBeanFactory(resource);

		// get target spring class object
		Object object = factory.getBean("msg");

		// cast the object
		WishMsg msg = (WishMsg) object;

		// execute the business logic
		System.out.println(msg.wish("suresh"));
	}

}
