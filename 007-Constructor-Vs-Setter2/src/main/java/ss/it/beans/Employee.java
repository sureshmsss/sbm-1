package ss.it.beans;

public class Employee {

	// mandatory properties
	private String name;
	private int id;
	private String dept;

	// optional properties
	private String add;
	private long mobile;

	public Employee(String name, int id, String dept) {
		System.out.println("Employee()-4-param Consturctor");
		this.name = name;
		this.id = id;
		this.dept = dept;
//		this.add = add;
	}

	public void setAdd(String add) {
		System.out.println("Employee.setAdd()");
		this.add = add;
	}

	public void setMobile(long mobile) {
		System.out.println("Employee.setMobile()");
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + ", add=" + add + ", mobile=" + mobile + "]";
	}

}
