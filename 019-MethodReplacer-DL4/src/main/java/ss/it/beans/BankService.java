package ss.it.beans;

public class BankService {
	public BankService() {
		System.out.println("0-param of " + this.getClass());
	}

	public double calcInterestAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calcInterestAmount()");
		// calculate interest amount
		return (pamt * Math.pow(1 + rate, time)) - pamt;
	}
}
