package Controller;

import Model.*;


import java.util.ArrayList;
import java.util.List;

public class Contr {
    public String name,username,pass,email;
    public void save(){
        try {
            Serv.getInstance().save(new Enti().setName("masoume").setUsername("msmmrz")
                    .setPass("msmmrz").setEmail("msmmrz"));
            Serv.getInstance().save(new Enti().setName("a").setUsername("a").
                    setPass("a").setEmail("a"));
            Serv.getInstance().save(new Enti().setName("b").setUsername("b")
                    .setPass("b").setEmail("b"));
        }
        catch (Exception e){
            System.out.println("failed to save ! " + e.getMessage());
        }
    }
    public String Username,Pass;
    public void edit(){
        try {

            Serv.getInstance().edit(Username,Pass,new Enti().setName(name)
                    .setUsername(username).setPass(pass).setEmail(email));
        }
        catch (Exception e){
            System.out.println("failed to edit! " +e.getMessage());
        }
    }
    public List<Enti> report(){
        List<Enti> entis=new ArrayList<>();
        try {
            entis=Serv.getInstance().report();
        }
        catch (Exception e){
            e.getMessage();
        }
        return entis;
    }
}
