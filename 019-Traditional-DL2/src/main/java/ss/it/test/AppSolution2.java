package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.Cricketter;

public class AppSolution2 {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext2.xml");

		// get the spring bean object
		Cricketter cricketter = ctx.getBean("cktr", Cricketter.class);

		// invoke the b.method
		cricketter.batting();
		cricketter.bowling();
		cricketter.fielding();
		cricketter.wicketKeeping();

	}
}
