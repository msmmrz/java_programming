package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        User user =new User();
        User user1= null;
        User user2=null;
        User user3=null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        user.setName(input.nextLine());
        System.out.println("Enter username");
        user.setUsername(input.nextLine());
        System.out.println("Enter password");
        user.setPassword(input.nextLine());
        System.out.println(user.getName()+"\n"+user.getUsername()+"\n"+user.getPassword());
        try {
            user1 = (User) user.clone();
            user2 = (User) user.clone();
            user3 = (User) user.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("Not supported");
        }
        System.out.println("Enter name");
        user1.setName(input.nextLine());
        System.out.println("Enter username");
        user1.setUsername(input.nextLine());
        System.out.println("Enter password");
        user1.setPassword(input.nextLine());
        System.out.println("Enter name");
        user2.setName(input.nextLine());
        System.out.println("Enter username");
        user2.setUsername(input.nextLine());
        System.out.println("Enter password");
        user2.setPassword(input.nextLine());
        System.out.println("Enter name");
        user3.setName(input.nextLine());
        System.out.println("Enter username");
        user3.setUsername(input.nextLine());
        System.out.println("Enter password");
        user3.setPassword(input.nextLine());
        System.out.println(user1.getName()+"\n"+user1.getUsername()+"\n"+user1.getPassword());
        System.out.println(user2.getName()+"\n"+user2.getUsername()+"\n"+user2.getPassword());
        System.out.println(user3.getName()+"\n"+user3.getUsername()+"\n"+user3.getPassword());

    }
}
