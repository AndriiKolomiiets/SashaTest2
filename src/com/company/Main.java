package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("The contact input program\nWould you like to create a new contact? (Yes/No)");
        Scanner inputAnsver = new Scanner(System.in);
        String theAnsver = inputAnsver.nextLine();
        Person[] unit = new Person[12];
        int i = 0;
        while (theAnsver.equals("Yes")) {
            System.out.println("Stage 2");
            unit[i] = new Person();
            unit[i].getUserInput();
            i++;
            System.out.println("Do you wont to create one more new contact? (Yes/No)");
            theAnsver = inputAnsver.nextLine();
        }
        int n = i++;
        System.out.println("You saved " + n + " contacts.");
        if (n > 0) {
            System.out.println("Would you like to print them out to check?");
        } else {
            System.out.println("Thank you for using this app!\nHave a nice day!");
        }
      /*  String printOutInput = inputAnsver.nextLine();

        if (printOutInput.equals("Yes")) {
            for (int k = i + 1; i > 0; i--) {
                System.out.println(unit[i]);
            }
            System.out.println("Thank you for using this app!\nHave a nice day!");
        } else {
            System.out.println("Thank you for using this app!\nHave a nice day!");
        }*/
    }
}
