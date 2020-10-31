package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Student student= new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        student.setName(input.nextLine());
        System.out.println("Enter number student");
        student.setNumber_student(input.nextLine());
        System.out.println("Enter father name");
        student.setFather_name(input.nextLine());
        System.out.println("Enter number of math");
        list.add(input.nextLine());
        System.out.println("Enter number of programming");
        list.add(input.nextLine());
        System.out.println("Enter number of programming workshop");
        list.add(input.nextLine());
        System.out.println("Enter number of physics");
        list.add(input.nextLine());
        System.out.println("Enter number of history");
        list.add(input.nextLine());
        System.out.println(student.getName()+"\n"+student.getNumber_student()+"\n"+student.getFather_name());
        System.out.println("The grades are:");
        for(String s : list){
            System.out.println(s);
        }
    }
}
