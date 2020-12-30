package com.company.Controller;

import com.company.Model.Entity.PersonE;
import com.company.Model.Service.PersonS;

import java.util.List;
import java.util.Scanner;

public class PersonC {
    PersonE personE = new PersonE();
    Scanner input=new Scanner(System.in);
    public void save() {
        System.out.println("Enter your name : ");
        String name=input.nextLine();
        System.out.println("Enter your username : ");
        String username=input.nextLine();
        System.out.println("Enter your password : ");
        String pass=input.nextLine();
        System.out.println("Enter your email : ");
        String email=input.nextLine();
        try {
            PersonS.getInstance().save(
                    new PersonE().setName(name).setUsername(username).setPass(pass).setEmail(email));

        } catch (Exception e) {
            System.out.println("Fail to save!" + e.getMessage());
        }
    }
    public void report(){
        try {
            System.out.println("pls enter your username : ");
            String username=(input.next());
            System.out.println("pls enter your pass : ");
            String pass=input.next();
            List<PersonE> personList = PersonS.getInstance().report (
                    new PersonE().setUsername(username).setPass(pass));
        }
        catch (Exception e){
            System.out.println ("Fail to report!"+e.getMessage ());
        }
    }

}
