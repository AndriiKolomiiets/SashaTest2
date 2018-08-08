package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int fibonacci = 0;
        int nextFibonacci = 1;
        int fibonacciSeries = 1;
        System.out.println("Please input the number up to fibonacci series you would like to print out:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Iteration block
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries + " ");
            fibonacciSeries = fibonacci + nextFibonacci;
            fibonacci = nextFibonacci;
            nextFibonacci = fibonacciSeries;

        }

    }
}
