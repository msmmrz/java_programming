package com.company;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Masoume");
        user.setFamily("Mirzayi");
        user.setAge("21");
        user.setPass("1234");
        user.setUsername("Msm_Mrz");
        user.setJob("Student");
        System.out.println(user.getName()+"\n"+user.getFamily()+"\n"+user.getAge()+"\n"
                +user.getPass()+"\n"+user.getUsername()+"\n"+ user.getJob());


    }
}
