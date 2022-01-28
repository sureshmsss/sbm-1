package ss.it.beans;

public class Wish {
	private int id;

	public void setId(int id1) {
		this.id = id1;
	}

	@Override
	public String toString() {
		return "id : " + id;
	}
	
	/*	public void explanation() {
			System.out.println("
			the name attribute of property should definitely match with the setter method of setXxx(-) method
			it not looks for the param name of setter method
			
			
			the private setter methods can not be done to the container
			
			");
		}
	*/	

}
