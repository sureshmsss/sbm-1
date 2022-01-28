package ss.it.vo;

public class ZoomVo {

	// bean properties
	private String name;
	private String mobNo;
	private String course;
	private String mailId;
	private String fee;

	// setter & getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	// toString method
	@Override
	public String toString() {
		return "ZoomVo [name=" + name + ", mobNo=" + mobNo + ", course=" + course + ", mailId=" + mailId + ", fee="
				+ fee + "]";
	}

}
