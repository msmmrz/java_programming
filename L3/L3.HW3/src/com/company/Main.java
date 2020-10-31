package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        Str s= new Str();
         s.setS(input.nextLine());
         try {
             s.getS();
         } catch (Exception e) {
             System.out.println("Don't enter number");
         }
    }
}