package com.example.demo.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("beans.xml");
        //cap.close();

        //ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("beans2.xml");
        //cap.close();

        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("beans3.xml");
        cap.close();
    }
}
