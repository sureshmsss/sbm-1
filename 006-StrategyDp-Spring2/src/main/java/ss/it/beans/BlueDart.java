package ss.it.beans;

public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "bluedart is delivering";
	}

}
