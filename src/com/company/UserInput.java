package com.company;
import java.util.Scanner;

public class UserInput {

    public void getUserInput(String args[]){
        Scanner userInput = new Scanner(System.in);
            System.out.println("Enter your number ");
        int theNumber = userInput.nextInt();

        userInput.close();
    }
}
