package com.company;

public class Res {
    int perimeter;
    int area;
    int num1;
    int num2;

    public Res(int num1, int num2) {
        this.num1 = num1 ;
        this.num2 = num2 ;
        if(num1==num2){
            System.out.println("It's quarter");
        }else System.out.println("It's rectangle");
    }

    public void perimeter() {

        this.perimeter=(num1+num2)*2;
        System.out.println("perimeter is: "+ perimeter);
    }
    public void area() {
        this.area=num1*num2;
        System.out.println("area is: " +area);
    }

}
