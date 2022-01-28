package ss.it.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ss.it.beans.Mobile;
import ss.it.beans.SIM;

public class App {

	public static void main(String[] args) {
		System.out.println("main start()");

		// locate and hold spring bean config file
		FileSystemResource resource = new FileSystemResource("src/main/java/ss/it/cfgs/applicationContext.xml");

		// create beanfactory container
		BeanFactory factory = new XmlBeanFactory(resource);

		// ccreate spring bean class object
		Object obj1 = factory.getBean("sim1");
		Object obj2 = factory.getBean("mobi");

		// cast the object with spring bean class
		Mobile mob = (Mobile) obj2;
		SIM sim = (SIM) obj1;

		// print the result
		System.out.println(mob.toString());
		System.out.println(sim.toString());

	}
}
