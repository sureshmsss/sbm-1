package ss.it.beans;

public class A {

	private String osname;

	private String path;

	public A() {
		System.out.println(this.getClass());
	}

	public void setOsname(String osname) {
		System.out.println("method of OSName");
		this.osname = osname;
	}

	public void setPath(String path) {
		System.out.println("method of path");
		this.path = path;
	}

}
