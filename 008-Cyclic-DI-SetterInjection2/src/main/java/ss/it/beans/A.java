package ss.it.beans;

public class A {
	// properties
	private B b;

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "B=>>"+b;
	}

}
