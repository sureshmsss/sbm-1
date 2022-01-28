package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.FlipKart;

public class Test {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext.xml");

		// create target spring bean
		FlipKart f = ctx.getBean("kart", FlipKart.class);

		// call b.method
		System.out.println("the amount is :" + f.discount(2500, 15));

		// close the container
		ctx.close();

	}

}
