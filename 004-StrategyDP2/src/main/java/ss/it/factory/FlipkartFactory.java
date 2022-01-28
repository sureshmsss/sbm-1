package ss.it.factory;

import ss.it.beans.BlueDart;
import ss.it.beans.Courier;
import ss.it.beans.DTDC;
import ss.it.beans.Flipkart;

public class FlipkartFactory {
	public static Flipkart createFlipkart(String courierType) {
		
		//create target class object
		Flipkart fpkt=new Flipkart();
		Courier courier =null;
		
		//create dependent class object courier type
		if(courierType.equals("dtdc"))
			courier=new DTDC();
		else if(courierType.equals("bd"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid courier type");
		
		//set dependent class object to target class
		fpkt.setCourier(courier);
		
		return fpkt;
		
	}

}
