package ss.it.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ss.it.factory.VehicleFactory;
@Component("vc")
public class Vehicle {
	@Autowired
	@Qualifier("diesel")
	// HAS-A relation
	private Engine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}

	// setter method
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// create business method
	public String drivingVehicle(String type, int speed) {
		VehicleFactory v = new VehicleFactory();
		engine=v.createVehicle(type);
		// use engine
		String status = engine.drive(speed);
		return "i'm driving by " + type + " engine vehicle with speed of " + speed;
	}

}
