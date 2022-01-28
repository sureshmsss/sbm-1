package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.WishMsg;

public class Test {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext.xml");

		// get target spring class object
		WishMsg msg = ctx.getBean("msg", WishMsg.class);

		// execute the business logic
		System.out.println(msg.wish("suresh"));
	}

}
