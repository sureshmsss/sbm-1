package ss.it.beans;

public class Mobile {

	private long imei;
	private int ram;
	private String tech;

	// HAS-A Relation
	private SIM sim;

	public void setImei(long imei) {
		this.imei = imei;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setTech(String version) {
		this.tech = version;
	}

	public void setSim(SIM sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile : " + imei + " " + ram + " " + tech + "";
	}

}
