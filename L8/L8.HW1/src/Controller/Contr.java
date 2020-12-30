package Controller;

import Model.*;
import Model.*;

public class Contr {
    public String name,family,address,phonenumber,melicode,skill;
    public String age,experience;
    public void save(){
        try {

            Serv.getInstance().save(
                    new Enti().setName(name).setFamily(family).setMelicode(melicode)
                            .setPhonenumber(phonenumber).setAddress(address).setSkill(skill).
                            setAge(age).setExperience(experience));
        }
        catch (Exception e){
            System.out.println("faild to save!!! " + e.getMessage());
        }
    }
}
