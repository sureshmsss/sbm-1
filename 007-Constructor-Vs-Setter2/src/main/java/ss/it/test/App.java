package ss.it.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import ss.it.beans.Employee;

public class App {
	public static void main(String[] args) {

		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationContext.xml");

		// call the container to create spring bean object
		Employee e = factory.getBean("emp", Employee.class);
		Employee e1 = factory.getBean("emp1", Employee.class);
		// execute the b.logic
		System.out.println(e.toString());

	}
}
