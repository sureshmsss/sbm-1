package ss.it.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ss.it.bo.ShopBo;
import ss.it.controller.ShopController;
import ss.it.dao.ShopDaoImpl;
import ss.it.vo.ShopVo;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"ss/it/cfgs/applicationContext.xml");

		// call the ioc to create object
		ShopController st = factory.getBean("controller", ShopController.class);

		// set data to vo
		ShopVo vo = new ShopVo();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		vo.setName(sc.nextLine());
		System.out.println("enter bill");
		vo.setBill(sc.nextLine());

		// execute b.method
		try {
			System.out.println(st.processBill(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
