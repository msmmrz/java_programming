package com.company;

public class Teacher extends University {
    public Teacher(){
        System.out.println("1-Teacher");
    }

    @Override
    public void job() {
        System.out.println("Teacher");
    }
}
