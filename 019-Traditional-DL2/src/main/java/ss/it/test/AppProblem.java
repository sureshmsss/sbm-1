package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.Cricketter;

public class AppProblem {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext.xml");

		// get the spring bean object
		Cricketter cricketter = ctx.getBean("cktr", Cricketter.class);

		// invoke the b.method
		cricketter.batting();
		System.out.println("----------");
		cricketter.batting();
		cricketter.bowling();
		cricketter.fielding();
		cricketter.wicketKeeping();

	}
}
