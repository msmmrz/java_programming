package com.company;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Average {
    DecimalFormat df2 =new DecimalFormat("#.##");
    float Programming;
    float Mathematics;
    float Physic;
    float History;
    int zp , zf , zh ,zm;
    float sum;
    int zarib;
    double avg;

    public Average( float Programming,float Mathematics,float Physic ,float History , int zp , int zm , int zf , int zh){
        this.Programming = Programming;
        this.Mathematics = Mathematics;
        this.Physic = Physic;
        this.History = History;
        this.zp=zp;
        this.zm=zm;
        this.zf =zf;
        this.zh=zh;
        zarib=(zp+zm+zf+zh);
        sum=((Programming*zp)+(Mathematics*zm)+(Physic*zf)+(History*zh));
    }

    public void x( ){
        avg = sum/zarib;
        if(avg<10){
            System.out.println("oftadi");
        }
        if (avg<12){
            System.out.println("mashroot");
        }
        if (avg>12){
            System.out.println("ghabooli");
        }
        df2.setRoundingMode(RoundingMode.DOWN);
        System.out.println("your average is: "+df2.format(avg));

    }

    }

