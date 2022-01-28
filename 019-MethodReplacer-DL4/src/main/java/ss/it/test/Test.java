package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.BankService;

public class Test {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext.xml");

		// create target spring bean
		BankService s = ctx.getBean("service", BankService.class);

		// call b.method
		System.out.println("the amount is :" + s.calcInterestAmount(100000, 2, 12));

		// close the container
		ctx.close();

	}

}
