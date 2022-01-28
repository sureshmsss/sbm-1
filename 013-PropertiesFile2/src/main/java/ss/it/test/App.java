package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import ss.it.beans.A;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext(
				"ss/it/cfgs/applicationContext.xml");

		A a = ct.getBean("a", A.class);
		System.out.println(a);
		System.out.println(System.getProperties());
	}
}
