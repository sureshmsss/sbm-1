package ss.it.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ss.it.beans.Wishing;
import ss.it.cfgs.AppConfig;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test.main()");

		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get spring bean class object
		Wishing w = ctx.getBean("w", Wishing.class);

		System.out.println("hello " + w.wish("suresh"));

	}

}
