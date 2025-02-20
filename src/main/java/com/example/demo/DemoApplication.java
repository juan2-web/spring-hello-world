package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// 
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		//BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		// ojo: lo retornado por por el factory es un objeto de tipo Object
		//Student student = (Student) factory.getBean("student");

		// ApplicationContext
		//ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		//Student student = context.getBean(Student.class);

		// usando el metodo run: crea el contenedor, los beans, manage dependency injection and life cycle of those beans
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Student student = context.getBean(Student.class);
		

		System.out.println(student);
	}

}
