package com.company;

public class Str {
    private  String s;



    public void setS(String s) {
        this.s = s;

    }
    public String getS() throws Exception {
        if(s.matches(".*\\d.*")){
            throw new Exception();
        }else {
            System.out.println("String length is : "+s.length());
        }
        return s;
    }

}
