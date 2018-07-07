package com.company;

import java.util.Random;

public class Randomiser {
    int random = (int )(Math.random() * 100 + 1);
    public void setRandom () {
        System.out.println("The computer's number is " + random);
    }
}
