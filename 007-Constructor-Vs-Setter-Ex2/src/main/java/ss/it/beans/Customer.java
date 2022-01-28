package ss.it.beans;

public class Customer {
	// mandatory properties
	private long mobile;
	private String email;
	private String pwd;

	public Customer(long mobile, String email, String pwd) {
		System.out.println("Customer()-3-Param constructor");
		this.mobile = mobile;
		this.email = email;
		this.pwd = pwd;
	}

	// optional properties
	private String name;
	private String upi;
	private String add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpi() {
		return upi;
	}

	public void setUpi(String upi) {
		this.upi = upi;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Customer [mobile=" + mobile + ", email=" + email + ", pwd=" + pwd + ", name=" + name + ", upi=" + upi
				+ ", add=" + add + "]";
	}

}
