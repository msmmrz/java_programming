package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        MyInteger number = new Number(a);
        if (a == 0) {
            number.isZero(a);
        } else if (a % 2 == 0) {
            number.isEven(a);
        } else {
            number.isOdd(a);
        }
        if(a<0){
            number.isNegative(a);
        }
        if(a>0){
            number.isPosetive(a);
        }

    }
}
