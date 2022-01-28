package ss.it.beans;

public class Wish1 {
	private int id1;

	public Wish1(int id) {
		System.out.println("Wish1()-1-param");
		this.id1 = id;
	}

	@Override
	public String toString() {
		return "id : " + id1;
	}
	/*	public void explanation() {
	System.out.println("
	the name attribute of constructor-arg tag should definitely match with the param of constructor.
	it not looks for the spring beans property name
	
	
				the private constructor injection can be done to the container by using ref-api
	
	");
	}
	*/
}
