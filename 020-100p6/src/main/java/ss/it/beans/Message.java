package ss.it.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class Message {
	@Autowired
//	@Lazy(true)
	private LocalDateTime ldt;

	public Message() {
		System.out.println("0-param of  " + this.getClass());
	}

	public String getMonthName(String user) {
		System.out.println("Message.getMonthName() ");
		return "hi " + user + " this month name is " + ldt.getMonth();
	}

}
