package ss.it.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mdata")
public class MyData {
	@Autowired
	private Date date;

	public MyData() {
		System.out.println("0-param of " + this.getClass());
	}

	public String getDate(String user) {
		return "mr." + user + " todays date is " + date;
	}

}
