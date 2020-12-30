package Model.CarEnti;

public class CarEnti {
    private String carmodel;
    private String personname;
    private String melicode;
    private int price;


    public String getCarmodel() {
        return carmodel;
    }

    public CarEnti setCarmodel(String carmodel) {
        this.carmodel = carmodel;
        return this;
    }

    public String getPersonname() {
        return personname;
    }

    public CarEnti setPersonname(String personname) {
        this.personname = personname;
        return this;
    }

    public String getMelicode() {
        return melicode;
    }

    public CarEnti setMelicode(String melicode) {
        this.melicode = melicode;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public CarEnti setPrice(int price) {
        this.price = price;
        return this;
    }

}
