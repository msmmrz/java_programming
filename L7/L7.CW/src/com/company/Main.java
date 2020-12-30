package com.company;

import com.company.Controller.PersonC;

import java.util.Scanner;

public class Main {
    // name username pass email = a saved 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonC personC = new PersonC();
        while (true) {
            System.out.println("1-create a new account :\n2-enter to your account :\n3-exit.");
            int i = input.nextInt();
            switch (i) {
                case 1:
                    personC.save();
                    break;
                case 2:
                    personC.report();
                    break;

                default:break;
            }

            break;
        }
    }
}
