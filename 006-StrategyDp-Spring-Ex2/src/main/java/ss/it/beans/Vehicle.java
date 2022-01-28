package ss.it.beans;

public final class Vehicle {
	// HAS A relation
	private Engine engine;

	public Vehicle() {
		System.out.println("Vehicle:vehicle()");
	}

	public void setEngine(Engine engine) {
		System.out.println("courier details are " + engine.getClass());
		this.engine = engine;
	}

	public String drivingVehicle(int speed) {
		String s = engine.drive(speed);

		return s + " thank you visit again";
	}

}
