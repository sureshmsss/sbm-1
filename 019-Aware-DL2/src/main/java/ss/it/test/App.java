package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.Cricketter;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// create IOC
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext.xml");

		// create the spring bean of target class
		Cricketter c = ctx.getBean("ckt", Cricketter.class);

		// invoke the b.method
		c.batting();
		c.bowling();
		c.fielding();

		// close the container

		ctx.close();
	}
}
