package ss.it.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ss.it.beans.GetDiscount;
import ss.it.config.AppConfig;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get the spring bean object
		GetDiscount d = ctx.getBean("getDiscount", GetDiscount.class);

		// call the business method
		System.out.println(d.calculateBill(66000));

		// close the containers
		ctx.close();
	}
}
