package com.example.demo;
// esta es una clase pojo:
/*
 * 
 * A POJO (Plain Old Java Object) class is a simple Java class that doesn't have any special restrictions or requirements. It's just a regular Java object that adheres to the following characteristics:
No Inheritance: It doesn't extend any other class (except Object, which is implicit).
No Special Annotations: It does not have any special annotations or interfaces.
Private Fields: Its fields (or member variables) are usually private, with public getter and setter methods for accessing them.
No Complex Behavior: A POJO class generally doesn't contain any complex behavior. It's meant to represent data (often used as a data transfer object).
Serializable: It can be serializable (implement Serializable interface), but it doesn't have to be.
 */
public class Student {
    private String name;
    private String age;

    public Student(){

    }
    public Student(String name, String age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Student{" + "name = '" + name + '\'' + ", age='" + age + '\'' +"}";
    }
}
