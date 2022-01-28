package ss.it.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMsgConst {

	// has a property
	private Date date;

	@Autowired
	public WishMsgConst(@Qualifier("dt2") Date date) {
		System.out.println("WishMsgConst.WishMsg()");
		this.date = date;
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
