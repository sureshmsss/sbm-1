package ss.it.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("w")
public class Wishing {
	// Has-A property
	@Autowired
	private LocalDateTime ldt;

	public String wish(String user) {
		if (ldt.getHour() < 6)
			return "G M " + user;
		else if (ldt.getHour() < 16)
			return "G A " + user;
		else if (ldt.getHour() < 20)
			return "G E " + user;
		else
			return "G N " + user;
	}
}
