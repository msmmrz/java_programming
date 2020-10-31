package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        System.out.println("for borrow enter 1 & give back enter 2" );
        int n = input.nextInt();
        switch (n){
            case 1:{
                library.borrowing();
                break;
            }
            case 2:{
                library.giveBack();
                break;
            }
            default:
                return;
        }

    }
}
