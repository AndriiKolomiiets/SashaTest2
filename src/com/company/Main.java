package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("The contact input program\nWould you like to create a new contact? (Yes/No)");
        Scanner inputAnswer = new Scanner(System.in);
        String theAnsver = inputAnswer.nextLine();
         Person[] personArr = new Person[12];
        int i = 0;
        while (theAnsver.equals("Yes")) {

            Person person = new Person();
//            person.getUserInput();
//            person.toString();
                    //System.out.println("Stage 2");
//            unit[i] = new Person();
//            unit[i].getUserInput();
            person.getUserInput();

            System.out.println(person.toString());
            personArr [i] = person;
                    i++;
            System.out.println("Do you wont to create one more new contact? (Yes/No)");
            theAnsver = inputAnswer.nextLine();
        }
        int n = i++;
        System.out.println("You saved " + n + " contacts.");
        System.out.println(personArr[0]);
        String byeMessage = "Thank you for using this app!\nHave a nice day!";
        if (n > 0) {
            System.out.println("Would you like to print them out to check?");
        } else {
            System.out.println(byeMessage);
        }
      /*  String printOutInput = inputAnswer.nextLine();

        if (printOutInput.equals("Yes")) {
            for (int k = i + 1; i > 0; i--) {
                System.out.println(unit[i]);
            }
            System.out.println("byeMessage");
        } else {
            System.out.println("byeMessage");
        }*/
    }
}
