package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.WishMsg;
import ss.it.beans.WishMsgConst;

public class TestConst {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext2.xml");

		// get target spring class object
		WishMsgConst msg = ctx.getBean("msg", WishMsgConst.class);

		// execute the business logic
		System.out.println(msg.wish("suresh"));
	}

}
