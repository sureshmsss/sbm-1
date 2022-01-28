package ss.it.test;

import ss.it.beans.Vehicle;

public class App {
	public static void main(String[] args) {

		try {
			// get target class object
			Vehicle v = new Vehicle();
			System.out.println(v.driveVehicle("cng",80));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
