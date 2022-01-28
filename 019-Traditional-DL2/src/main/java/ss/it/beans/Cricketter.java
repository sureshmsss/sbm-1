package ss.it.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Cricketter {
	public Cricketter() {
		System.out.println("0-param of " + this.getClass());
	}
/*
 //this code is for Appproblem
	public void batting() {
		System.out.println("Cricketter.batting()");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext.xml");

		// get spring bean object
		Bat bat = ctx.getBean("bat", Bat.class);

		// invoke the business method
		System.out.println("score is " + bat.getScore());
	}
*/
	//this code is for AppSolution2
	public void batting() {
		System.out.println("Cricketter.batting()");
		
		//create the file system resource
		FileSystemResource resource=new FileSystemResource("src/main/java/ss/it/cfgs/applicationContext.xml");
		
	
		BeanFactory ctx = new XmlBeanFactory(resource);
		

		// get spring bean object
		Bat bat = ctx.getBean("bat", Bat.class);

		// invoke the business method
		System.out.println("score is " + bat.getScore());
	}
	public void bowling() {
		System.out.println("Cricketter.bowling()");
	}

	public void wicketKeeping() {
		System.out.println("Cricketter.wicketKeeping()");
	}

	public void fielding() {
		System.out.println("Cricketter.fielding()");
	}

}
