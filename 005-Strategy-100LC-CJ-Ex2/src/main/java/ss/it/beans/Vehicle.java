package ss.it.beans;

public class Vehicle {

	// HAS-A relation
	private Engine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}

	// setter method
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String driveVehicle(String type, int speed) {

		if (type.equals("cng"))
			engine = new CNG();
		else if (type.equals("petrol"))
			engine = new Petrol();
		else if (type.equals("diesel"))
			engine = new Diesel();
		else
			throw new IllegalArgumentException("we are sorry, we dont have that vehicle");
		
		String s=engine.drive(speed);
		return s+" thank you visit again ";
	}

}
