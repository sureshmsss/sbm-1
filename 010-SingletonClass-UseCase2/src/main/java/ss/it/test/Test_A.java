package ss.it.test;

import java.util.List;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import ss.it.ston.Arithmetic_A;
import ss.it.ston.Arithmetic_A2;
import ss.it.ston.Arithmetic_A3;
import ss.it.ston.CacheMemory;
import ss.it.ston.CacheMemory2;

public class Test_A {

	public static void main(String[] args) {
		// IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationcontext.xml");
		System.out.println("===============================");
		System.out.println("Problem part1");
		Arithmetic_A a = new Arithmetic_A();
		System.out.println(a.sum(12, 20) + "=" + a.hashCode());
		Arithmetic_A a1 = new Arithmetic_A();
		System.out.println(a.sum(12, 20) + "=" + a1.hashCode());
		System.out.println("=================================");
		System.out.println("solution part1-core java");
		Arithmetic_A2 a2 = Arithmetic_A2.getInstance();
		Arithmetic_A2 a3 = Arithmetic_A2.getInstance();
		System.out.println(a2 + "===" + a2.hashCode());
		System.out.println(a3 + "===" + a3.hashCode());
		System.out.println("=================================");

		System.out.println("solution part1-spring");

		// call ioc to create obj
		Arithmetic_A2 a4 = factory.getBean("a_a1", Arithmetic_A2.class);
		Arithmetic_A2 a5 = factory.getBean("a_a1", Arithmetic_A2.class);
		System.out.println(a4 + "---" + a4.hashCode());
		System.out.println(a5 + "----" + a5.hashCode());
		System.out.println("=====================================");
		System.out.println("Problem part2");
		Arithmetic_A3 a8 = new Arithmetic_A3();
		Arithmetic_A3 a9 = new Arithmetic_A3();
		System.out.println(a8 + "=" + a8.hashCode());
		System.out.println(a9 + "=" + a9.hashCode());
		System.out.println("=====================================");
		System.out.println("Solution part2-core java");
		Arithmetic_A3 a10 = Arithmetic_A3.getInstance();
		Arithmetic_A3 a11 = Arithmetic_A3.getInstance();
		System.out.println(a10 + "=" + a10.hashCode());
		System.out.println(a11 + "=" + a11.hashCode());
		System.out.println("=====================================");
		System.out.println("Solution part2-spring");
		Arithmetic_A3 a12 = factory.getBean("a_a12", Arithmetic_A3.class);
		Arithmetic_A3 a13 = factory.getBean("a_a12", Arithmetic_A3.class);
		System.out.println(a12 + "=" + a12.hashCode());
		System.out.println(a13 + "=" + a13.hashCode());
		System.out.println("========================================");
		System.out.println("problem part-3");
		CacheMemory c1 = new CacheMemory();
		List<String> list1 = c1.getConutries("world");
		CacheMemory c2 = new CacheMemory();
		List<String> list2 = c2.getConutries("world");
		System.out.println(c1 + "-" + c1.hashCode());
		System.out.println(c2 + "-" + c2.hashCode());
		System.out.println("=====================================");
		System.out.println("Solution Part1-core java");
		CacheMemory2 c3 = CacheMemory2.getInstance();
		CacheMemory2 c4 = CacheMemory2.getInstance();
		System.out.println(c3.hashCode() + "---" + c4.hashCode());
		System.out.println("=====================================");
		System.out.println("solution part1-spring");
		CacheMemory2 c5 = factory.getBean("m1", CacheMemory2.class);
		CacheMemory2 c6 = factory.getBean("m1", CacheMemory2.class);
		System.out.println(c5.hashCode() + "---" + c6.hashCode());

	}

}
