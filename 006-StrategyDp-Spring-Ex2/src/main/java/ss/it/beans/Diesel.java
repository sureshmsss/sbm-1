package ss.it.beans;

public final class Diesel implements Engine {
	public Diesel() {
		System.out.println("Diesel.engine()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("Diesel.drive()");
		return "Diesel is driving";
	}
}
