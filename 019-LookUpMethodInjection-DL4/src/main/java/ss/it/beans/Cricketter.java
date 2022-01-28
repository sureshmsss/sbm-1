package ss.it.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("ckt")
public abstract class Cricketter {
	// no Has-a relation of dependent class
	public Cricketter() {
		System.out.println("0-param of " + this.getClass());
	}

	public void batting() {
		System.out.println("Cricketter.batting()");
		Bat bat = createBat();

		// invoke method
		int score = bat.getScore();
		System.out.println(score + " is the score");
	}

	@Lookup
	public abstract Bat createBat();

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
