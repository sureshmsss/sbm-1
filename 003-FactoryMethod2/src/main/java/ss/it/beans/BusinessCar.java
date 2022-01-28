package ss.it.beans;

public class BusinessCar implements Car{

	public BusinessCar(String regNo) {
		System.out.println("this is BusinessCar RegisteredNo is : "+regNo);
	}

	@Override
	public void drive() {
		System.out.println("Driving BusinessCar");
	}

}
