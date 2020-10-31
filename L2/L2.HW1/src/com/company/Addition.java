package com.company;

public class Addition extends Calculator{

    public Addition(double a,double b) {
        super(a, b);
        double result = (a+b);
        System.out.println(result);
    }

}
