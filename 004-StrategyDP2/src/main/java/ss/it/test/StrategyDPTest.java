package ss.it.test;

import ss.it.beans.Flipkart;
import ss.it.factory.FlipkartFactory;

public class StrategyDPTest {
	public static void main(String[] args) {

		try {
			// get Target class object
			Flipkart fp = FlipkartFactory.createFlipkart("dtdc");

			// invoke the business method
			String result = fp.shopping(new String[] { "shirt", "pant", "trouser", "mobile" },
					new float[] { 500.0f, 600.0f, 600.0f, 9000.0f });

			System.out.println(result);

			System.out.println("============================");
			Flipkart fp2 = FlipkartFactory.createFlipkart("bd");
			String result2 = fp2.shopping(new String[] { "shirt", "pant", "trouser", "mobile" },
					new float[] { 500.0f, 600.0f, 600.0f, 9000.0f });

			System.out.println(result2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
