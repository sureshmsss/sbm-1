package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.Vehicle;

public class Test {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext.xml");
		
		Vehicle v=ctx.getBean("vc",Vehicle.class);
		
		System.out.println("------");
	}

}
