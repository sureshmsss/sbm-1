package ss.it.beans;

/**
 * Hello world!
 *
 */
public class UIDAI {

	private long uidno;
	private String name;
	private long dob;
	private String add;

	public void setUidno(long uidno) {
		this.uidno = uidno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(long dob) {
		this.dob = dob;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "UIDAI : uidno-" + uidno + " name-" + name + " dob-" + dob + " add-" + add + "";
	}

}
