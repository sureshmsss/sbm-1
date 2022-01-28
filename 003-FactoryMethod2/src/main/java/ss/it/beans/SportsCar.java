package ss.it.beans;

public class SportsCar implements Car{

	public SportsCar(String regNo) {
		System.out.println("this is SportsCar RegisteredNo is : "+regNo);
	}

	@Override
	public void drive() {
		System.out.println("Driving SportsCar");
	}

}
