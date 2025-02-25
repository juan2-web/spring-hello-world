package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<Employee, Address> employees;

    // Getter
    public Map<Employee, Address> getEmployees() {
        return employees;
    }

    // Setter
    public void setEmployees(Map<Employee, Address> employees) {
        this.employees = employees;
    }

    // ojo: este constructor es necesario para los dos beans en los que estamos usando esta clase
    public Company() {
        this.employees = new HashMap<>();
    }

    public Company(Map<Employee, Address> employees) {
        this.employees = employees;
    }

    public void display() {
        for (Map.Entry<Employee, Address> entry : employees.entrySet()) {
            System.out.println(
                    "Employee Data ->"
                            + entry.getKey().toString() + " Address ->"
                            + entry.getValue().toString());
        }
    }
}
