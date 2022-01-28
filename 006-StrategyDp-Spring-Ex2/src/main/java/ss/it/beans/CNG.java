package ss.it.beans;

public final class CNG implements Engine {
	public CNG() {
		System.out.println("CNG.engine()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("CNG.drive()");
		return "CNG is driving";
	}

}
