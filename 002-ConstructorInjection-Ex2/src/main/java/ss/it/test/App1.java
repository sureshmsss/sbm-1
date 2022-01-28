package ss.it.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import ss.it.beans.Wish;
import ss.it.beans.Wish1;

public class App1 {
	public static void main(String[] args) {
		System.out.println("main app()");
		// classpath resoucre
		ClassPathResource resource = new ClassPathResource("applicationcontext.xml");

		// create bean factory
		BeanFactory factory = new XmlBeanFactory(resource);

		// create the object of spring bean
		Object obj = factory.getBean("uid");

		// cast the object to Wish class
		Wish w = (Wish) obj;
		Wish1 w1 = (Wish1) factory.getBean("uid1");

		// call the b method
		System.out.println(w.toString());
		System.out.println("=====wish1 experiment=====");
		System.out.println(w1.toString());
	}
}
