package com.company;
import java.util.*;

public class TheGame {

    public static void main(String[] args) {
        TheGame game = new TheGame();
        game.getUserInput();
        game.setRandom();
        game.Finish();
    }
    public void getUserInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your number ");
        int theNumber = userInput.nextInt();

        userInput.close();
    }




    int random = (int )(Math.random() * 100 + 1);
    public void setRandom () {
        System.out.println("The computer's number is " + random);
    }



    public void Finish (){

        if ( random ==  ) )
    }
}

}