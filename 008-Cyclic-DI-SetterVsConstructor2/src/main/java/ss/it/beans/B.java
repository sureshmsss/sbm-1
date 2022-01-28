package ss.it.beans;

public class B {
	// properties
	private A a;

	public B(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "constructor toString from B class::::A=>>:" +a;
	}

}
