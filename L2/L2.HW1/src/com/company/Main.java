package com.company;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Calculator Cal = new Calculator(a,b);
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        int n= input.nextInt();
        switch (n){
            case 1:{
                Calculator addition = new Addition(a,b);
                break;
            }
            case 2:{
                Calculator subtraction = new Subtraction(a,b);
                break;
            }
            case 3:{
                Calculator multiplication = new Multiplication(a,b);
                break;
            }
            case 4:{
                Calculator division = new Division(a,b);
                break;
            }
            default:{
                System.out.println("Not find");
                break;
            }
        }
    }
}
