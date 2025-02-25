package com.example.demo.domain;

public class Address {
     // Class data members 
     private String houseNo; 
     private String pincode; 
     private String state; 
     private String country; 
    
     // Constructor 
     public Address(String houseNo, String pincode, 
                    String state, String country) 
     { 
         super(); // ??
         this.houseNo = houseNo; 
         this.pincode = pincode; 
         this.state = state; 
         this.country = country; 
     } 
    
     // Method 
     // Overriding toString() method 
     @Override
     public String toString() 
     { 
         return "[" + houseNo + "," + pincode + "," + state 
             + "," + country + "]"; 
     } 
}
