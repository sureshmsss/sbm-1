package ss.it.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component("ckt")
public class Cricketter implements ApplicationContextAware {
	// Has-a relation
	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx = ctx;
	}

	public void batting() {
		System.out.println("Cricketter.batting()");
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
