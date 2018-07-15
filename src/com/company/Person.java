package com.company;

import java.util.*;

public class Person {

    Scanner userInput = new Scanner(System.in);

    public void getUserInput() {
        System.out.println("Enter your name:");
        String name = userInput.next();
        System.out.println("Enter your surname:");
        String surname = userInput.next();
        System.out.println("How old are you?");
        String age = userInput.next();
        userInput.close();
    }

}
