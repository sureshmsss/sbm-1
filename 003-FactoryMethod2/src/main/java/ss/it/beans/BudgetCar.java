package ss.it.beans;

public class BudgetCar implements Car{

	public BudgetCar(String regNo) {
		System.out.println("this is BudgetCar RegisteredNo is : "+regNo);
	}

	@Override
	public void drive() {
		System.out.println("Driving BudgetCar");
	}
	


}
