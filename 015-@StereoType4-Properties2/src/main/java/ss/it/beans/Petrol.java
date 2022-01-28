package ss.it.beans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class Petrol implements Engine {
	public Petrol() {
		System.out.println("Petrol.Petrol()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("Petrol.drive()");
		return "driving with petrol " + speed;
	}

}
