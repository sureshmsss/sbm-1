package ss.it.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("vc")
public abstract class Vehicle {
	// no Has-a relation of dependent class
	public Vehicle() {
		System.out.println("0-param of " + this.getClass());
	}

	@Lookup
	public abstract Engine createEngine();

	public void driving() {
		System.out.println("Vehicle.driving()");
		Engine e = createEngine();
		int speed = e.getSpeed();
		System.out.println(speed + " is the speed");
	}

	public void parking() {
		System.out.println("Vehicle.parking()");
	}

	public void soundHorn() {
		System.out.println("Vehicle.soundHorn()");
	}

	public void entertaining() {
		System.out.println("Vehicle.entertaining()");
	}

}
