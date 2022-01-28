package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.WishMsgSetter;

public class TestSetter {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext3.xml");

		// get target spring class object
		WishMsgSetter msg = ctx.getBean("msg", WishMsgSetter.class);

		// execute the business logic
		System.out.println(msg.wish("suresh"));
	}

}
