package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        University teacher = new Teacher();
        University student = new Student();
        University employee= new Employee();
        int n = input.nextInt();
        switch (n){
            case 1:{
                teacher.job();break;
            }
            case 2:{
                student.job();break;
            }
            case 3:{
                employee.job();break;
            }
            default: {
                System.out.println("Not find");
                break;
            }
        }
    }
}
