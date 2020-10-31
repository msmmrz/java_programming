package com.company;

public class Employee extends University {
    public Employee(){
        System.out.println("3-Employee");
    }

    @Override
    public void job() {
        System.out.println("Employee");
    }
}
