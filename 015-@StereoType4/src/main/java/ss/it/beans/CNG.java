package ss.it.beans;

import org.springframework.stereotype.Component;

@Component("cng")
public class CNG implements Engine {
	public CNG() {
		System.out.println("CNG.CNG()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("CNG.drive()");
		return "driving with CNG " + speed;
	}

}
