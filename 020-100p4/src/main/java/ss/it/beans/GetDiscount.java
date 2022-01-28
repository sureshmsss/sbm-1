package ss.it.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GetDiscount {
	@Autowired
	@Value("${dis.val}")
	private double dis;

	public String calculateBill(double bill) {
		double billAmt = 0.0;
		if (bill > 5000) {
			billAmt = bill - bill / 100 * dis;
			return "the bill is " + billAmt;
		} else {
			billAmt = bill - bill / 100 * dis;
			return "the bill is " + billAmt;
		}
	}

}
