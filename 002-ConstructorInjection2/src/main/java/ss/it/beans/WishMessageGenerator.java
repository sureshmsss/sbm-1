package ss.it.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator()-1-param construcotr");
		System.out.println(date);
		this.date = date;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator date-" + date;
	}
	

}
