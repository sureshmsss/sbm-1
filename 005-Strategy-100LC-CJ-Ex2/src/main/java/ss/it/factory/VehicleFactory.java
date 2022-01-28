package ss.it.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import ss.it.beans.Engine;
import ss.it.beans.Vehicle;

public class VehicleFactory {
	private static Properties props;
	static {
		try {
			// load the properties file
			FileInputStream fis = new FileInputStream("ss/it/commons/info.properties");
			props = new Properties();
			props.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Vehicle createEngine(String type) throws Exception {
		// create Vehicle Class object
		Vehicle v = new Vehicle();

		// load dependent class object
		Class c = Class.forName(props.getProperty("engine.type"));

		// create the object of dependent using reflection api
		Constructor con[] = c.getDeclaredConstructors();

		// create object
		Engine engine = (Engine) con[0].newInstance();
		
		//set dependent class to target class object
		v.setEngine(engine);
		return v;
	}

}
