package ss.it.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cng")
public class CNG implements Engine {
	@Value("${os.name}")
	private String os;
 
	public CNG() {
		System.out.println("CNG.CNG()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("CNG.drive()");
		return "driving with CNG " + speed;
	}

}
