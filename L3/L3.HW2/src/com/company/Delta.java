package com.company;

import javax.lang.model.type.NullType;

public class Delta {
    private int a , b ,c;
    double answer;
    double answer1;
    double answer2;
    public Delta(int a , int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void calculate() throws Exception{
        answer= (b*b-4*a*c);
        if(answer<0){
            throw new Exception();
        }
           else if(answer>0){
                answer=  Math.sqrt(answer);
                answer1=(-b+answer)/(2*a);
                answer2=(-b-answer)/(2*a);
                System.out.println(answer1);
                System.out.println(answer2);
            }

       else if(answer==0){
            answer=  Math.sqrt(answer);
            answer1=(-b)/(2*a);
            System.out.println(answer1+"c");
        }
}
}