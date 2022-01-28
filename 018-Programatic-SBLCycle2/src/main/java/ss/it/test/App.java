package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.Voting;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext.xml");

		// get spring bean object
		Voting v = ctx.getBean("vote", Voting.class);

		// invoke the business method
		System.out.println(v.checkVoting());

		// close the container
		ctx.close();

	}
}
