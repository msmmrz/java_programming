package com.company;

public class Subtraction extends Calculator {
    public Subtraction(double a, double b) {
        super(a,b);
        double result = (a-b);
        System.out.println(result);
    }
}
