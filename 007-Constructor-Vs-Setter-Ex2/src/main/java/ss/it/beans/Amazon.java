package ss.it.beans;

public class Amazon {
	// Has-A relation
	private Retailer retailer;
	private Customer customer;

	public void setRetailer(Retailer retailer) {
		System.out.println("Amazon.setRetailer()");
		this.retailer = retailer;
	}

	public void setCustomer(Customer customer) {
		System.out.println("Amazon.setCustomer()");
		this.customer = customer;
	}

	public void shope(String type) {
		String status = null;
		if (Retailer.availabilty(type).equals("yes"))
			System.out.println("we are sending the " + type + " to you, thank you for shoppping");
		else
			System.out.println("we are sorry for what you are looking here, thank you");

	}

}
