package com.company;

import java.util.*;

public class TheGame {

// It is where the Game begins


    final int random;

    // Constructor TheGame
    public TheGame() {
        random = (int) (Math.random() * 100 + 1);
        System.out.println("The computer's number is " + random);
        System.out.println("*the line above was displayed just for checking mistakes");
        System.out.println(" ");
    }

    public void performTheGame() {
        int theNumber = 0;
        int i = 0;
        Scanner userInput = new Scanner(System.in);
        while (theNumber != 500) {
            i++;
            // Getting User input
            System.out.println("It is your " + i + " attempt");

            System.out.println("Enter your number ");
            theNumber = userInput.nextInt();


            // Checking for the winner
            if (random == theNumber) {
                System.out.println("You win! Computer number was " + random + "\nYou made " + i + " attempt(s)" );
                theNumber = 500;
            } else if (random < theNumber) {
                System.out.println("It is less. Try again");
            } else {
                System.out.println("It is more. Try again");
            }
        }
        userInput.close();
    }


}



