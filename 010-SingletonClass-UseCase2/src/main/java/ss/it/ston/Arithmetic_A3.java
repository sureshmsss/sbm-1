package ss.it.ston;

public class Arithmetic_A3 {
	// properties
	private final float PI = 3.14f;
	private static Arithmetic_A3 INSTANCE;

	public Arithmetic_A3() {
	}

	public static Arithmetic_A3 getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Arithmetic_A3();
		return INSTANCE;
	}

	public float radius(float radius) {
		return PI * radius;
	}

}
