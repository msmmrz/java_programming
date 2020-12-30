package Model;

public class InternetE {
    private String username;
    private String pass;
    private int id,internet_size,price;

    public int getId() {
        return id;
    }

    public InternetE setId(int id) {
        this.id = id;
        return this;
    }

    public int getInternet_size() {
        return internet_size;
    }

    public InternetE setInternet_size(int internet_size) {
        this.internet_size = internet_size;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public InternetE setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public InternetE setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public InternetE setPass(String pass) {
        this.pass = pass;
        return this;
    }
}
