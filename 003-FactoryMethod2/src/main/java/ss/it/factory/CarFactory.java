package ss.it.factory;

import ss.it.beans.BudgetCar;
import ss.it.beans.BusinessCar;
import ss.it.beans.Car;
import ss.it.beans.SportsCar;

public class CarFactory {
	public Car getCar(String type,String regNo) {
		if (type.equals("sports"))
			return new SportsCar(regNo);
		else if (type.equals("budget"))
			return new BudgetCar(regNo);
		else if (type.equals("business"))
			return new BusinessCar(regNo);
		else
			throw new IllegalArgumentException("wrong specification");
	}

}
