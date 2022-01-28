package ss.it.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("diesel")
@Primary
public class Diesel implements Engine {
	public Diesel() {
		System.out.println("Diesel.Diesel()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("Diesel.drive()");
		return "driving with diesel " + speed;
	}

}
