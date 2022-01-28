package ss.it.beans;

public class Petrol implements Engine {
	public Petrol() {
		System.out.println("Petrol.Petrol()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("Petrol.drive()");
		return "petrol engine with speed :" + speed;
	}

}
