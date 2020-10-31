package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Info info = new Info();
        Map student = new TreeMap();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number student");
        info.setStudent_number(input.nextLine());
        student.put("number student",info.getStudent_number());
        System.out.println("Enter Full name");
        info.setFull_name(input.nextLine());
        student.put("Full name",info.getFull_name());
        System.out.println("Enter total average");
        info.setTotal_average(input.nextLine());
        student.put("Total average",info.getTotal_average());
       Set set = student.entrySet();
        for(Object o : set){
            System.out.println(o);

        }

    }
}
