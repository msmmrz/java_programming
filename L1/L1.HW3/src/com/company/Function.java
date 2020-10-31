package com.company;

public class Function {

    int  e ,f;
    int a , b , c , d ;
    int x,y;

    public Function(int e , int f ,int a , int b , int c , int d){

        this.e=e;
        this.f=f;
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public void X(){
        if ((a*d)-(b*c)==0){
            System.out.println("unsolvable");
        }else {
            x=((e*d)-(b*f))/((a*d)-(b*c));
            y=((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("x: "+x+"\n"+"y: "+y);
        }
    }
}
