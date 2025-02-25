package com.example.demo.domain;

import java.util.Map;

public class InfoBean {
    
    private String name; 
    private String msg; 
    private Map<String, String> frameworks; 
      
      
    public Map<String, String> getFrameworks() { 
        return frameworks; 
    } 
    public void setFrameworks(Map<String, String> frameworks) { 
        this.frameworks = frameworks; 
    } 
    public String getName() { 
        return name; 
    } 
    public void setName(String name) { 
        this.name = name; 
    } 
    public String getMsg() { 
        return msg; 
    } 
    public void setMsg(String msg) { 
        this.msg = msg; 
    } 
      
    public void display() { 
        System.out.println("Hi "+name+", "+msg); 
        System.out.println("Framework Names: Description"); 
        for (Map.Entry<String,String> entry : frameworks.entrySet()) 
            System.out.println(entry.getKey() + ": " + entry.getValue()); 
    } 
}
