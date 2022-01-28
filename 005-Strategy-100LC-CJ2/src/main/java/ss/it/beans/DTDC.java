package ss.it.beans;

public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		System.out.println("Bluedart.deliver()");
		return "delivered by dtdc " +oid;
	}
}
