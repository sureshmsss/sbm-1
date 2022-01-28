package ss.it.beans;

public final class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(int oid) {
		return oid + " this is delivered by bluedart";
	}

}
