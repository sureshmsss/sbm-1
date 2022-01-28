package ss.it.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import ss.it.beans.A;
import ss.it.beans.B;

public class App {
	public static void main(String[] args) {

		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationContext.xml");

		// call the container to create the object of spring bean
/*		A a = factory.getBean("a1", A.class);
		System.out.println(a);
*/
		B b = factory.getBean("b1", B.class);
		System.out.println(b);

	}
}
