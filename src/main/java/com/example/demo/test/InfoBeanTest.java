package com.example.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.domain.InfoBean;

public class InfoBeanTest {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
        InfoBean infoBean = (InfoBean) con.getBean("info");
        infoBean.display();
    }
}
