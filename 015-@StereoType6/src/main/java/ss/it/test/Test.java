package ss.it.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.beans.MyData;

public class Test {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext.xml");
		
		//create sping beans object
		MyData m=ctx.getBean("mdata",MyData.class);
		
		//call the business logic
		System.out.println(m.getDate("suresh"));

		System.out.println("beans names are ::" + Arrays.toString(ctx.getBeanDefinitionNames()));

	}

}
