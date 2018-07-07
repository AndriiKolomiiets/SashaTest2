package com.company;
import java.sql.SQLOutput;
import java.util.*;

// It is where the Game begins

public class TheGame {

    public static void main(String[] args) {
        TheGame game = new TheGame();
        game.getUserInput();
        game.setRandom();
        game.Finish();
    }
// Getting User input

    int theNumber;
    /* it is important to have this variable out of method.
    Otherwise I couldn't use it in different methods */

    public void getUserInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your number ");
        theNumber = userInput.nextInt();

        userInput.close();
        System.out.println(" ");
    }


// Getting computer random number
    int random = (int )(Math.random() * 100 + 1);
    public void setRandom () {
        System.out.println("The computer's number is " + random);
        System.out.println("*the line above was displayed just for checking mistakes");
        System.out.println(" ");
    }

// Comparing two numbers and displaying the result
    public void Finish (){

        if ( random ==  theNumber) {
            System.out.println("You win! Computer number was " + random);
    }
    else if ( random < theNumber) {
            System.out.println("You loose:( Computer number was " + random);
        }
        else   {
            System.out.println("You loose:( Computer number was "+ random);
        }
}

}