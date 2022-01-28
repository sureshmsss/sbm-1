package ss.it.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component//("voting")
@PropertySource("ss/it/commons/info.properties")
public class Voting {
	// bean properties
	@Value("${per.name}")
	private String name;
	@Value("${per.addrs}")
	private String addrs;
	@Value("${per.age}")
	private int age;
	private Date verifiedOn;

	// custom init method
	@PostConstruct
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
	@PreDestroy
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
