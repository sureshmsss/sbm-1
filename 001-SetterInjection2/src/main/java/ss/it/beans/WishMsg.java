package ss.it.beans;

import java.util.Date;

public class WishMsg {

	private Date date;

	public WishMsg() {
		System.out.println("WishMsg.WishMsg()");
	}
	
	public void setDate(Date date) {
		this.date=date;
	}

	public String wish(String user) {
		System.out.println("wish method opened");
		int hour = date.getHours();
		if (hour < 7)
			return "G M " + user;
		else if (hour < 12)
			return "G A N " + user;
		else if (hour < 16)
			return "G E " + user;
		else
			return "G N " + user;
	}

	
	
}
