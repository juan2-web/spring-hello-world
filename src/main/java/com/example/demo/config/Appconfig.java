/* 
    clase de configuracion que contiene todos
    los java beans usando la configuracion con java
*/

package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.Student;

@Configuration
public class Appconfig {
    @Bean
    public Student student(){
        return new Student(1, "Geek");
    }
}
