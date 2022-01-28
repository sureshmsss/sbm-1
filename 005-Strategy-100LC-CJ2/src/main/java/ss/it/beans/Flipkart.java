package ss.it.beans;

import java.util.Random;

public final class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String shoping(String[] items, float[] prices) {
		float bill = 0.0f;
		for (int i = 0; i < items.length; i++)
			bill = bill + prices[i];
		int oid = new Random().nextInt();
		return "thank you for shopping the bill is " + bill + " and the order id is " + oid;
	}

}
//String[]{"shirt","pant","trousers","shoes","sandals","chapppal"},float[]{500.0f,600.0f,660.0f,560.0f,700.0f,900.0f})
