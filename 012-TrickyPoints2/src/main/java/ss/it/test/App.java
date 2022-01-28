package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import ss.it.beans.A1;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		FileSystemXmlApplicationContext ct = new FileSystemXmlApplicationContext(
				"src/main/java/ss/it/cfgs/applicationContext2.xml");
		// ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext.xml");
		// create the spring bean object by calling factory method
		A1 a1 = ct.getBean("a1", A1.class);
		System.out.println(a1.hashCode());
	}
}
