package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Mark & zarib Programming:");
        float Programming = input.nextFloat();
        int zp = input.nextInt();
        System.out.println("Mark & zarib Mathematics:");
        float Mathematics = input.nextFloat();
        int zm = input.nextInt();
        System.out.println("Mark & zarib Physic:");
        float Physic = input.nextFloat();
        int zf = input.nextInt();
        System.out.println("Mark & zarib History:");
        float History = input.nextFloat();
        int zh = input.nextInt();
        Average average = new Average( Programming,Mathematics,Physic,History,zp , zm , zf ,zh);
        average.x();

    }
}
