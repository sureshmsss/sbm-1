package ss.it.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import ss.it.beans.Vehicle;

public class Test {

	public static void main(String[] args) {
		// create ioc container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationContext.xml");

		// call container to create the object of target class
		Vehicle v1 = (Vehicle) factory.getBean("v");

		// call the business method
		System.out.println(v1.drivingVehicle(80));
	}

}
