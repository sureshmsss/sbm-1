package ss.it.beans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Bat {
	public Bat() {
		System.out.println("0-param of " + this.getClass());
	}
	
	public int getScore() {
		return new Random().nextInt(112);
	}

}
