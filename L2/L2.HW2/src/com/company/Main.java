package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Dars kargah_pishrafte = new Kargah_pishrafte();
        Dars pishrafte = new Pishrafte();
        Dars madar_manteghi = new Madar_manteghi();
        Dars andishe_2 = new Andishe_2();
        System.out.println("Darse khod ra entekhab konid");
        System.out.println("1-Kargah_pishrafte\n2-Pishrafte\n3-Madar_manteghi\n4-Andishe_2");
        int n =input.nextInt();
        switch (n){
            case 1:{
                kargah_pishrafte.vahed();
                kargah_pishrafte.ham_niyaz();
                kargah_pishrafte.pish_niyaz();
                break;
            }
            case 2:{
                pishrafte.vahed();
                pishrafte.ham_niyaz();
                pishrafte.pish_niyaz();
                break;
            }
            case 3:{
                madar_manteghi.vahed();
                madar_manteghi.ham_niyaz();
                madar_manteghi.pish_niyaz();
                break;
            }
            case 4:{
                andishe_2.vahed();
                andishe_2.ham_niyaz();
                andishe_2.pish_niyaz();
                break;
            }
            default:{
                System.out.println("Not find");
                break;
            }
        }

    }
}
