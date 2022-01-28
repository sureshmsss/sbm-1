package ss.it.beans;

import java.util.Date;

public class Voting {
	// bean properties
	private String name;
	private String addrs;
	private int age;
	private Date verifiedOn;

	public void setName(String name) {
		System.out.println("Voting.setName()");
		this.name = name;
	}

	public void setAddrs(String addrs) {
		System.out.println("Voting.setAddrs()");
		this.addrs = addrs;
	}

	public void setAge(int age) {
		System.out.println("Voting.setAge()");
		this.age = age;
	}

	// custom init method
	public void myInit() {
		System.out.println("Voting.myInit()");
		// initialize left over properties
		verifiedOn = new Date();

		if (addrs == null)
			addrs = "not provided";
		// validation logic
		if (name == null)
			throw new IllegalArgumentException("name is required");
		else if (age <= 0 || age >= 126)
			throw new IllegalArgumentException("age is must be in the range of 0 to 125");
	}

	// custom destroy method
	public void myDestroy() {
		System.out.println("Voting.myDestroy()");
		// nullifying the bean properties
		name = null;
		addrs = null;
		age = 0;
		verifiedOn = null;
	}

	public String checkVoting() {
		if (age > 18)
			return "mr./miss/mr&miss." + name + " belongs to " + addrs + " is elgible for voting -> verified On "
					+ verifiedOn;
		else
			return "mr./miss/mr&miss." + name + " belongs to " + addrs + " is not elgible for voting -> verified On "
					+ verifiedOn;
	}

}
