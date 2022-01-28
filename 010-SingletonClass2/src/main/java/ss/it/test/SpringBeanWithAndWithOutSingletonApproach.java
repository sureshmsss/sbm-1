package ss.it.test;

import ss.it.ston.*;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class SpringBeanWithAndWithOutSingletonApproach {
	public static void main(String[] args) {

		// IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationcontext2.xml");

		// call ioc to create obj
		Singleton s1 = factory.getBean("st1", Singleton.class);
		Singleton s2 = factory.getBean("st1", Singleton.class);

		System.out.println(s1 + "===" + s1.hashCode());
		System.out.println(s2 + "===" + s2.hashCode());
		System.out.println("=============================================");
		Singleton s3 = factory.getBean("st01", Singleton.class);
		Singleton s4 = factory.getBean("st02", Singleton.class);

		System.out.println(s3 + "===" + s3.hashCode());
		System.out.println(s4 + "===" + s4.hashCode());
		System.out.println("=============================================");
		Singleton s5 = factory.getBean("st001", Singleton.class);
		Singleton s6 = factory.getBean("st002", Singleton.class);

		System.out.println(s5 + "===" + s5.hashCode());
		System.out.println(s6 + "===" + s6.hashCode());
		
		
	}
}
