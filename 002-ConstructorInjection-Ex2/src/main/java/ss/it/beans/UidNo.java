package ss.it.beans;

public class UidNo {
	private String gender;
	private String name;
	private String dob;

	public UidNo(String gender, String name, String dob) {
		System.out.println("UidNo.UidNo()-3-param");
		this.gender = gender;
		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "UidNo gender-" + gender + ", name=" + name + ", dob=" + dob + "]";
	}
	

}
