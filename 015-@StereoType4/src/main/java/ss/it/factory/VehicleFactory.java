package ss.it.factory;

import ss.it.beans.CNG;
import ss.it.beans.Diesel;
import ss.it.beans.Engine;
import ss.it.beans.Petrol;
import ss.it.beans.Vehicle;

public class VehicleFactory {
	public static Engine createVehicle(String type) {

		// create targe class object
		Vehicle vehicle = new Vehicle();
		Engine engine = null;

		// return the engine type on getting type
		if (type.equals("petrol"))
			engine = new Petrol();
		else if (type.equals("diesel"))
			engine = new Diesel();
		else if (type.equals("cng"))
			engine = new CNG();
		else
			throw new IllegalArgumentException("the type you've specified is not manufacturing");
		// return engine type to vehicle
		vehicle.setEngine(engine);

		return engine;
	}
}
