package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.Vehicle;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// create IOC
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext.xml");

		// create the spring bean of target class
		Vehicle c = ctx.getBean("vc", Vehicle.class);

		// invoke the b.method
		c.driving();
		c.parking();
		c.entertaining();
		c.soundHorn();
		// close the container

		ctx.close();
	}
}
