package ss.it.beans;

public final class DHL implements Courier {
	public DHL() {
		System.out.println("DHL.DHL()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return "dhl is delivering";
	}
}
