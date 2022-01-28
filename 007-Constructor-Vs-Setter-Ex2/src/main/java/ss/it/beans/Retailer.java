package ss.it.beans;

public class Retailer {

	// mandatory properties
	private String name;
	private long mobile;
	private String address;

	public Retailer() {
		System.out.println("Retailer(0)-param");
	}

	public Retailer(String name, long mobile, String address) {
		System.out.println("Retailer(3)-param");
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public static String availabilty(String type) {
		if (type.equals("elec"))
			return "yes";
		else
			return "no";
	}

}
