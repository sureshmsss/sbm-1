package ss.it.beans;

public class Bluedart implements Courier {

	@Override
	public String deliver(int oid) {
		System.out.println("Bluedart.deliver()");
		return "delivered by bluedart :" + oid;
	}

}
