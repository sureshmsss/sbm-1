package ss.it.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class SingleTonTest {

	public static void main(String[] args) {

		System.out.println("-----------------------------");
		// create ioc container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationcontext.xml");

		Class d = factory.getBean("c1", Class.class);

		System.out.println("class :" + d.getClass()+"-\n"+d.toString());
		System.out.println("-----------------------------");
		Calendar c = factory.getBean("cal", Calendar.class);

		System.out.println("cal :" + c.getClass() + "-\n" + c.toString());
		System.out.println("-----------------------------");

		Properties p = factory.getBean("props", Properties.class);

		System.out.println("props :" + p.getClass() + "-\n" + p.toString()+"-"+p);
		System.out.println("-----------------------------");

		String s2 = factory.getBean("s1", String.class);
		System.out.println("s2 class :" + s2.getClass() + "-" + s2);

		System.out.println("-------------------------------");
		String s3 = factory.getBean("s3", String.class);
		System.out.println("s3 :" + s3.getClass() + "-" + s3.toString()+"-"+s3);
		System.out.println("-------------------------------");

	}

}
