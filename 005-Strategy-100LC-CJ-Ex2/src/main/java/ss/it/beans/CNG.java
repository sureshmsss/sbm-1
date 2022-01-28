package ss.it.beans;

public class CNG implements Engine {
	public CNG() {
		System.out.println("CNG.CNG()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("CNG.drive()");
		return "cng engine with speed :" + speed;
	}

}
