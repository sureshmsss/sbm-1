package ss.it.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import ss.it.beans.Courier;
import ss.it.beans.Flipkart;

public class FlipkartFactory {

	private static Properties props;

	static {
		System.out.println("FlipkartFactory.static block");
		try {
			// load the properties file
			FileInputStream fis = new FileInputStream("src/main/java/ss/it/commons/info.properties");

			props = new Properties();
			props.load(fis);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	// static factory method supporting factory pattern
	public Flipkart createfpkt() throws Exception {

		// create target class object
		Flipkart fp = new Flipkart();
		// load dependent class object
		Class c = Class.forName(props.getProperty("courier.type"));
		// get the object or create the object using reflection api
		Constructor cons[] = c.getDeclaredConstructors();

		// create object
		Courier courier = (Courier) cons[0].newInstance();

		// set dependent class to target class object
		fp.setCourier(courier);

		return fp;
	}

}
