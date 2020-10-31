package com.company;

import java.util.Scanner;

public class Library {

    Scanner input = new Scanner(System.in);

    public void borrowing(){
        System.out.println("enter book name");
        String name =input.nextLine();
        System.out.println("enter date ");
        String date = input.nextLine();
        System.out.println("book borrowed");
    }
    public void giveBack(){
        System.out.println("enter book name");
        String name =input.nextLine();
        System.out.println("enter date ");
        String date = input.nextLine();
        System.out.println("book given back");
    }
}
