package com.company;

public class Number implements MyInteger {
    int a;
    public Number(int a){
        this.a=a;
    }
    @Override
    public void isEven(int a) {
        System.out.println("Number is Even");
    }

    @Override
    public void isOdd(int a) {
        System.out.println("Number is Odd");

    }

    @Override
    public void isPosetive(int a) {
        System.out.println("Number is Posetive");

    }

    @Override
    public void isNegative(int a) {
        System.out.println("Number is Negative");


    }

    @Override
    public void isZero(int a) {
        System.out.println("Number is Zero");

    }
}
