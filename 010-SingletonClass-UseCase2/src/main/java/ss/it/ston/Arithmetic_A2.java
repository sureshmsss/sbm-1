package ss.it.ston;

public class Arithmetic_A2 {
	//properties
	private static Arithmetic_A2 INSTANCE;
	
	
	public Arithmetic_A2() {	}
	
	public static Arithmetic_A2 getInstance() {
		if(INSTANCE==null)
			INSTANCE= new Arithmetic_A2();
		return INSTANCE;
	}
	public int sum(int a,int b) {
		return a+b;
	}

}
