package com.example.demo.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld2 implements InitializingBean, DisposableBean{
    // It is the init() method
    // of our bean and it gets
    // invoked on bean instantiation
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(
            "Bean HelloWorld has been "
            + "instantiated and I'm the "
            + "init() method");
    }
    // This method is invoked
    // just after the container
    // is closed
    @Override 
    public void destroy() throws Exception{
        System.out.println(
            "Container has been closed "
            + "and I'm the destroy() method");
    }
}
