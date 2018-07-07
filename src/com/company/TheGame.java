package com.company;
import java.sql.SQLOutput;
import java.util.*;

public class TheGame {

    public static void main(String[] args) {
        TheGame game = new TheGame();
        game.getUserInput();
        game.setRandom();
        game.Finish();
    }

    int theNumber;
    public void getUserInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your number ");
        theNumber = userInput.nextInt();

        userInput.close();
    }




    int random = (int )(Math.random() * 100 + 1);
    public void setRandom () {
        System.out.println("The computer's number is " + random);
    }



    public void Finish (){

        if ( random ==  theNumber) {
            System.out.println("You win! Computer number was " + random);
    }
    else if ( random < theNumber) {
            System.out.println("You loose:( Computer number was " + random);
        }
        else ( random > theNumber)      {
            System.out.println("You loose:( Computer number was "+ random);
        }
}

}