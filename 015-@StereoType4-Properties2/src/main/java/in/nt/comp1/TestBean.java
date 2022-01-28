package in.nt.comp1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tb")
public class TestBean {
	@Value("${per.name}")
	private String name;
	@Value("${os.name}")
	private String os;
	@Value("${Path}")
	private String path;

	@Override
	public String toString() {
		return "TestBean [name=" + name + ", os=" + os + ", path=" + path + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
