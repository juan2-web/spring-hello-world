package com.example.demo.domain;

// vamos a ilustrar inyeccion de dependencia usando constructores
public class Student2 {
    // Class data members
    private int id;
    private MathCheat mathCheat;
 
    // Constructor of Student class
    public Student2(int id, MathCheat mathCheat)
    {
        this.id = id;
        this.mathCheat = mathCheat;
    }
 
    // Method
    public void cheating()
    {
        System.out.println("My ID is: " + id);
        mathCheat.mathCheating();
    }
}
