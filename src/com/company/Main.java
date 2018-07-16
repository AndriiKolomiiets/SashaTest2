package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("The contact input program");
        Scanner inputAnsver = new Scanner(System.in);
        String theAnsver = "yes";
        System.out.println("Stage 1");
        String checkVariable = "yes";
        while (inputAnsver.equals("yes")){
            System.out.println("Stage 2");
            int i = 0;
            Person[] unit = new Person[12];
            unit[i] = new Person();
            i++;
            unit[i].getUserInput();


            System.out.println("Do you wont to create a new contact?");
            theAnsver = inputAnsver.next();

        }

    }
}
