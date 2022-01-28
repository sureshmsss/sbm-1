package ss.it.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import ss.it.controller.StudentController;
import ss.it.vo.StudentVo;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// create ioc
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ss/it/cfgs/applicationContext.xml");

		// call the container
		StudentController st1 = factory.getBean("contmysql", StudentController.class);
		StudentController st2 = factory.getBean("contora", StudentController.class);

		// call the business logic

		Scanner sc = new Scanner(System.in);

		StudentVo vo = new StudentVo();
		System.out.println("enter name");
		vo.setName(sc.nextLine());
		System.out.println("enter total");
		vo.setTotal(sc.nextLine());

		try {
			System.out.println(st1.processData(vo));
			System.out.println(st2.processData(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
