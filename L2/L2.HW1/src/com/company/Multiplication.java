package com.company;

public class Multiplication extends Calculator{
    public Multiplication(double a, double b) {
        super(a, b);
        double result = (a*b);
        System.out.println(result);
    }
}

