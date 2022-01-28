package ss.it.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import ss.it.beans.Flipkart;

public class Test {

	public static void main(String[] args) {
		// create ioc container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationContext.xml");
		// call the container to create object
		Flipkart fpkt = (Flipkart) factory.getBean("fp");
		System.out.println(fpkt.shoping(5));

	}

}
