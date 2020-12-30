package Model.CarServ;

import Model.CarEnti.CarEnti;
import Model.CarRepo.CarRepo;

import java.util.List;

public class CarServ {
    private CarServ(){};
    private static CarServ carServ = new CarServ();
    public static CarServ getInstance(){
        return carServ;
    }

    public void save(CarEnti carEnti) throws Exception{
        try (CarRepo carRepo=new CarRepo()){
            carRepo.insert(carEnti);
            carRepo.commit();
        }
    }
    public void report(CarEnti carEnti) throws Exception{
        try (CarRepo carRepo = new CarRepo()){
            carEnti.setPersonname(carEnti.getPersonname());
            carEnti.setMelicode(carEnti.getMelicode());
            carRepo.insert(carEnti);
            carRepo.select(carEnti);
            carRepo.commit();
        }
    }

}
