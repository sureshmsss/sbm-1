package ss.it.beans;

public class Diesel implements Engine {
	public Diesel() {
		System.out.println("Diesel.Diesel()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("Diesel.drive()");
		return "Diesel engine with speed :" + speed;
	}

}
