package ss.it.beans;

public final class Flipkart {
	// HAS A relation
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}

	public void setCourier(Courier courier) {
		System.out.println("courier details are "+courier.getClass());
		this.courier = courier;
	}

	public String shoping(int no) {
		float bill = no * 500;
		float billAmt = bill / 10f;
		bill = bill - billAmt;
		return "your bill is " + bill + " thankyou for shopping, welcome";
	}

}
