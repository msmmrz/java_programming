package com.company;

public class Division extends Calculator {
    public Division(double a, double b) {
        super(a, b);
        double result = (a/b);
        System.out.println(result);
    }
}
