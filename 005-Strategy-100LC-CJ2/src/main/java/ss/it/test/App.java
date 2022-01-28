package ss.it.test;

import ss.it.beans.Flipkart;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		try {
			// get target class obj from factory
			Flipkart fp = new Flipkart();
			// invoke business method
			String result = fp.shoping(new String[] { "shirt", "pant", "sandals", "chapppal" },
					new float[] { 660.0f, 560.0f, 700.0f, 900.0f });

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
