package com.company.Model.Entity;

public class PersonE {
    private String name;
    private String username;
    private String pass;
    private String email;

    public String getEmail() {
        return email;
    }

    public PersonE setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public PersonE setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public PersonE setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public PersonE setName(String name) {
        this.name = name;
        return this;
    }


}
