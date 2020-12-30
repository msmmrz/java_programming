package com.company.Model.Service;

import com.company.Model.Entity.PersonE;
import com.company.Model.Repository.PersonR;

import java.util.List;

public class PersonS {
    private static PersonS personS = new PersonS();

    public static PersonS getInstance() {
        return personS;
    }

    private PersonS() {
    }

    ;

    public void save(PersonE personE) throws Exception {
        try (PersonR personR = new PersonR()) {
            personE.setName(personE.getName());
            personE.setUsername(personE.getUsername());
            personE.setPass(personE.getPass());
            personE.setEmail(personE.getEmail());
            personR.insert(personE);
            personR.check(personE);
            personR.commit();
        }
    }

    public List<PersonE> report(PersonE personE1) throws Exception {
        List<PersonE> personES;
        try (PersonR personR = new PersonR()){
            personES=personR.select(personE1);
        }
        return personES;
    }
}