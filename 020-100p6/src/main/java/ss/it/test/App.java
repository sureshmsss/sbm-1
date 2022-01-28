package ss.it.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ss.it.beans.Message;
import ss.it.config.AppConfig;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get the spring bean object
		Message d = ctx.getBean("message", Message.class);

		// call the business method
		System.out.println(d.getMonthName("suresh"));
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));

		// close the containers
		ctx.close();
	}
}
/*
 
 [org.springframework.context.annotation.internalConfigurationAnnotationProcessor,
  org.springframework.context.annotation.internalAutowiredAnnotationProcessor,
   org.springframework.context.event.internalEventListenerProcessor,
    org.springframework.context.event.internalEventListenerFactory,
     appConfig, 
     message,
      getMonth]

 
 
*/