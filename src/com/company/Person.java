package com.company;

import java.util.*;

public class Person {

    private String name;
    private String surname;
    private String age;

    @Override
    public String toString() {
        return name + surname + age;

    }

    Scanner userInput = new Scanner(System.in);

    public void getUserInput() {
        System.out.println("Enter your name:");
        name = userInput.next();
        System.out.println("Enter your surname:");
        surname = userInput.next();
        System.out.println("How old are you?");
        age = userInput.next();
       // userInput.close();
    }

}
