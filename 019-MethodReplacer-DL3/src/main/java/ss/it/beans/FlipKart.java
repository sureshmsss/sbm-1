package ss.it.beans;

public class FlipKart {
	public FlipKart() {
		System.out.println("0-param of " + this.getClass());
	}

	public double discount(double price, double discount) {
		System.out.println("FlipKart.discount()");
		// calculate discount
		return price-((price/100)*discount);
	}
}
