package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.WishMsg4Level;

public class Test4Level {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext5.xml");

		// get target spring class object
		WishMsg4Level msg = ctx.getBean("msg", WishMsg4Level.class);

		// execute the business logic
		System.out.println(msg.wish("suresh"));
	}

}
