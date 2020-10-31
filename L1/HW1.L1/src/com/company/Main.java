package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 nums ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        Res res = new Res(num1 , num2);
        res.perimeter();
        res.area();

    }
}
