package com.company;

public class Student extends University {
    public Student(){
        System.out.println("2-Student");
    }

    @Override
    public void job() {
        System.out.println("Student");
    }
}
