package ss.it.beans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Engine {
	public Engine() {
		System.out.println("0-param of " + this.getClass());
	}
	
	public int getSpeed() {
		return new Random().nextInt(80);
	}

}
