package com.example.demo.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        // implementing Spring IoC using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //bean student
        Student2 stud2 = (Student2) context.getBean("student2");

        //stud2.cheating();

        //
        //System.out.println("student 3:");
        Student3 stud3 = (Student3) context.getBean("student3");
        //System.out.println(stud3);

        // injection with setters
        Company c = (Company) context.getBean("company");
        System.out.println("company display: ");
        c.display();

        // injection with constructor, using map
        Company c2 = (Company) context.getBean("company2");
        System.out.println("company with constructor injector:");
        c2.display();

    }
}
