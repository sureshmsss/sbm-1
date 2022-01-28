package ss.it.beans;

public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid) {
		return oid + " this is delivered by bluedart";
	}

}
