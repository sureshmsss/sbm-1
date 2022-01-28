package ss.it.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("diesel")
@Qualifier
@PropertySource("ss/it/commons/info.properties")
public class Diesel implements Engine {
	@Value("${per.name}")
	private String name;
	@Value("${os.name}")
	private String os;
	@Value("${Path}")
	private String path;

	public Diesel() {
		System.out.println("Diesel.Diesel()");
	}

	@Override
	public String drive(int speed) {
		System.out.println("Diesel.drive()");
		return "driving with diesel " + speed;
	}

	@Override
	public String toString() {
		return "Diesel [name=" + name + ", os=" + os + ", path=" + path + "]";
	}

}
