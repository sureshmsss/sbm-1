package ss.it.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMsg4Level {

	// has a property
	@Autowired
	@Qualifier("dt")
	private Date date;

	@Autowired
	@Qualifier("dt2")
	public void setDate(Date date) {
		System.out.println("setter method");
		this.date = date;
	}

	@Autowired
	@Qualifier("dt1")
	public void level(Date date) {
		System.out.println("Orbitary Method");
		this.date = date;
	}

	@Autowired
	public WishMsg4Level(@Qualifier("date") Date date) {
		System.out.println("WishMsg4Level.WishMsg()");
	}

	public String wish(String user) {
		System.out.println("wish method opened date :" + date);
		int hour = date.getHours();
		if (hour < 12)
			return "G M " + user;
		else if (hour < 16)
			return "G A N " + user;
		else if (hour < 20)
			return "G E " + user;
		else
			return "G N " + user;
	}

}
