package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X coefficient to power 2");
        a=input.nextInt();
        System.out.println("Enter X coefficient to power 1");
        b=input.nextInt();
        System.out.println("Enter fixed number");
        c=input.nextInt();
        Delta delta = new Delta(a,b,c);
        try {
            delta.calculate();
        }catch (Exception e){
            System.out.println("Equation does not answer ");
        }

    }
}
