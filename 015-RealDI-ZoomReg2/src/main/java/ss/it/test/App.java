package ss.it.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.controller.ZoomController;
import ss.it.vo.ZoomVo;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ss/it/cfgs/applicationContext.xml");

		// get the spring bean object
		ZoomController cnt = ctx.getBean("cnt", ZoomController.class);

		// read inputs as string values and store them into EmployeeVO class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name::");
		String name = sc.nextLine();
		System.out.println("Enter mobno::");
		String mobNo = sc.nextLine();
		System.out.println("Enter course::");
		String course = sc.nextLine();
		System.out.println("Enter mailId::");
		String mailId = sc.nextLine();
		System.out.println("Enter fee::");
		String fee = sc.nextLine();
		ZoomVo vo = new ZoomVo();
		vo.setName(name);
		vo.setMobNo(mobNo);
		vo.setCourse(course);
		vo.setMailId(mailId);
		vo.setFee(fee);
		// invoke methods
		try {
			// invoke the b.method
			String result = cnt.processDetails(vo);
			System.out.println(result);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Internal problem::" + e.getMessage());
		}

	}// main
}// class
