package Controller;

import Model.InternetE;
import Model.InternetS;

import java.util.List;

public class InternetC {
    public void check(String username,String pass){
        try {
                    InternetS.getInstance().report(new InternetE().setUsername(username).setPass(pass));


        } catch (Exception e) {
            System.out.println("Fail to save! " + e.getMessage());
        }
    }
    public void buy(int id,String username,String pass ){
        try {
            int internet_size ;
            int price;
            InternetS.getInstance().save(
                    new InternetE().setId(id).setUsername(username).setPass(pass));
            if(id==1){
                internet_size=2;
                price=1000;
                InternetS.getInstance().save(new InternetE().setId(id).setUsername(username).
                                setPass(pass).setPrice(price).setInternet_size(internet_size));
            }else if (id==2){
                internet_size=4;
                price=2000;
                InternetS.getInstance().save(new InternetE().setId(id).setUsername(username).
                                setPass(pass).setPrice(price).setInternet_size(internet_size));
            }else if (id==3){
                internet_size=10;
                price=5000;
                InternetS.getInstance().save(new InternetE().setId(id).setUsername(username).
                        setPass(pass).setPrice(price).setInternet_size(internet_size));
            }else if (id==4){
                internet_size=25;
                price=10000;
                InternetS.getInstance().save(new InternetE().setId(id).setUsername(username).
                        setPass(pass).setPrice(price).setInternet_size(internet_size));
            }
        }catch (Exception e){
            System.out.println("fail! " + e.getMessage());
        }
    }
    public void show(){
        System.out.println("pls choose a choice :\n1-2G:1000T\n" +
                "2-4G:2000T\n3-10G:5000T\n4-25G:10000T");


    }
}
