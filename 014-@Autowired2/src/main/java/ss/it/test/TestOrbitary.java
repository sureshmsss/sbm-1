package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.WishMsgOrbitary;

public class TestOrbitary {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext4.xml");

		// get target spring class object
		WishMsgOrbitary msg = ctx.getBean("msg", WishMsgOrbitary.class);

		// execute the business logic
		System.out.println(msg.wish("suresh"));
	}

}
