package ss.it.beans;

public class SIM {

	private long phno;
	private String company;
	private String type;

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SIM Details:" + type + "-" + company + "-" + phno + "";
	}

}
