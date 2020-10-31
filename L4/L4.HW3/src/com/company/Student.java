package com.company;

public class Student<NAME,NUMBER_STUDENT,FATHER_NAME>{
    public NAME name;
    public NUMBER_STUDENT number_student;
    public FATHER_NAME father_name;

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public NUMBER_STUDENT getNumber_student() {
        return number_student;
    }

    public void setNumber_student(NUMBER_STUDENT number_student) {
        this.number_student = number_student;
    }

    public FATHER_NAME getFather_name() {
        return father_name;
    }

    public void setFather_name(FATHER_NAME father_name) {
        this.father_name = father_name;
    }
}
