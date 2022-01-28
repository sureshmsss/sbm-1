package ss.it.beans;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	// HAS-A property
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	// deliver method nothing but business method
	public String shopping(String items[], float prices[]) {

		// calculate bill amt
		float billamt = 0.0f;
		for (int i = 0; i < items.length; ++i)
			billamt = billamt + prices[i];

		// generate order id
		int oid = new Random().nextInt(100000);
		// use courier for shopping
		String status = courier.deliver(oid);
		String finalmsg = Arrays.toString(items) + " bought with price " + Arrays.toString(prices) + " the bill is ";
		return finalmsg + "==" + status;

	}

}
