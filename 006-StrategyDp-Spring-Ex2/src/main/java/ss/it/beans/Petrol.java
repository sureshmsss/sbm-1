package ss.it.beans;

public final class Petrol implements Engine {
	public Petrol() {
		System.out.println("Petrol.engine()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("Petrol.drive()");
		return "Petrol is driving";
	}

}
