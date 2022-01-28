package ss.it.ston;

public class Arithmetic {

	// props
	private static Arithmetic INSTANCE;

	private Arithmetic() {
		System.out.println("Singleton.Singleton-0-Param");
	}

	// static factory method
	public static Arithmetic getInstance() {
		// singleton logic
		if (INSTANCE == null)
			INSTANCE = new Arithmetic();
		return INSTANCE;
	}

	// business method
	public void print(String msg) {
		System.out.println(msg);
	}

}
