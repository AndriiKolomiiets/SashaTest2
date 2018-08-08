package com.company;

import java.util.*;

public class Person {

    private int personNumber;
    private String name;
    private String surname;
    private String age;

    @Override
    public String toString() {
        return "Person # " + personNumber + "\n1. Name: " + name + "\n2.Surname: " + surname + "\n3. Age: " + age + "\n";
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }
}




