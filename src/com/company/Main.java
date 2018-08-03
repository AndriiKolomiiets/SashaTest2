package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("The contact base program\nIn the next few lines you have to fill an information about person");
        Scanner inputAnswer = new Scanner(System.in);
        int i = 0;
        String theAnswer;

        Person[] personArr = new Person[12];

        Scanner userInput = new Scanner(System.in);

        do {
            personArr[i] = new Person();
            int d = i + 1;
            personArr[i].setPersonNumber(d);
            System.out.println("Enter his(her) name:");
            personArr[i].setName(userInput.next());
            System.out.println("Enter his(her) surname:");
            personArr[i].setSurname(userInput.next());
            System.out.println("How old is he(she)?");
            personArr[i].setAge(userInput.next());

            i++;
            System.out.println("Would you like to create another contact? (Yes/No)");
            theAnswer = inputAnswer.nextLine();
        } while (theAnswer.equals("Yes"));
        int n = i++;
        String byeMessage = "Thank you for using this app!\nHave a nice day!";

        if (n > 0) {
            System.out.println("You saved " + n + " contacts.\nWould you like to print them out to check?");
            theAnswer = inputAnswer.nextLine();

            if (theAnswer.equals("Yes")) {

                System.out.println("There is a complete list of contacts\nPlease, check it out.");
                for (int k = 0; k < n; k++) {
                    System.out.println(personArr[k]);
                }
                System.out.println(byeMessage);
            }

        } else {
            System.out.println(byeMessage);
        }

    }
}
