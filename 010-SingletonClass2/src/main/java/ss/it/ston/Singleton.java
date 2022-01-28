package ss.it.ston;

public class Singleton {

	// props
	private static Singleton INSTANCE;

	private Singleton() {
		System.out.println("Singleton.Singleton-0-Param");
	}

	// static factory method
	public static Singleton getInstance() {
		// singleton logic
		if (INSTANCE == null)
			INSTANCE = new Singleton();
		return INSTANCE;
	}

	// business method
	public void print(String msg) {
		System.out.println(msg);
	}

}
