package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        int a= input.nextInt();
        System.out.println("Enter b");
        int b= input.nextInt();
        System.out.println("Enter c");
        int c = input.nextInt();
        System.out.println("Enter d");
        int d= input.nextInt();
        int e = 20 ;
        int f = 26;
        Function function = new Function(e ,f,a , b , c , d);
        function.X();
        //example: if a = 4 ,b=2 , c=4=, d=5 ---> x=4 , y =2
    }

}
