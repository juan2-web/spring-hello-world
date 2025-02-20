package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        // applicationContext para implementar spring ioc
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // get the bean
        Sim sim = applicationContext.getBean("sim", Sim.class);
        
        //Sim sim = new Jio();
        // Sim sim = new Airtel();

        sim.calling();
        sim.data();
    }
}
