package ss.it.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nt.comp1.TestBean;
import ss.it.beans.Diesel;
import ss.it.beans.Vehicle;

public class Test {

	public static void main(String[] args) {
		System.out.println("main app started");

		// create fileSystem Resuource
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationcontext.xml");

		Vehicle v = ctx.getBean("vc", Vehicle.class);
		v.drivingVehicle("diesel", 100);

		TestBean tb = ctx.getBean("tb", TestBean.class);
		System.out.println(tb);
		System.out.println("------");
		Diesel d =ctx.getBean("diesel",Diesel.class);
		System.out.println(d);

	}

}
