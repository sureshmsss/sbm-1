package ss.it.test;

import ss.it.beans.Car;
import ss.it.factory.CarFactory;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Car car1=new CarFactory().getCar("sports","AB00AB1234");
		car1.drive();
		System.out.println("===============");
		Car car2=new CarFactory().getCar("budget","AB00AB8614");
		car2.drive();
		System.out.println("===============");
		Car car3=new CarFactory().getCar("business","AB00AB1111");
		car3.drive();
	}
}
