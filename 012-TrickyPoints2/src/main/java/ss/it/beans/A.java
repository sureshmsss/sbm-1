package ss.it.beans;

public class A {
	private B b;

	public A() {
		System.out.println(this.getClass());
	}

	public void setB(B b) {
		this.b = b;
	}
}
