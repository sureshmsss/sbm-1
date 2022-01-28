package ss.it.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import ss.it.beans.Amazon;

public class App {
	public static void main(String[] args) {

		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationContext.xml");

		// call the container to create spring bean object
		Amazon a = factory.getBean("am", Amazon.class);
		// execute the b.logic
		a.shope("elec");
		System.out.println("====================");
		a.shope("home");
	/*	Amazon(0)-param
		Retailer(3)-param
		Customer()-3-Param constructor
		Amazon.setRetailer()
		Amazon.setCustomer()
		Retailer(0)-param
		we are sending the elec to you, thank you for shoppping
		====================
		Retailer(0)-param
		we are sorry, the home we don't have services, thank you for visiting
*/
	}
}

