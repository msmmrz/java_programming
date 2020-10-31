package com.company;

public class User<NAME,USERNAME,PASSWORD> implements Cloneable {
    public NAME name;
    public USERNAME username;
    public PASSWORD password;

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public USERNAME getUsername() {
        return username;
    }

    public void setUsername(USERNAME username) {
        this.username = username;
    }

    public PASSWORD getPassword() {
        return password;
    }

    public void setPassword(PASSWORD password) {
        this.password = password;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
