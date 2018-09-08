package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int sortedArray[] = {0, 1, 2, 4, 6, 9, 9, 12, 23, 23, 345, 687, 45896};
        binarySearch(23, sortedArray, 0, 12);

    }

    /*
    1. If midpoint is smaller than key, it needs to work with right part.
    2. If midpoint if bigger than key, we should work with left part.
    3. If midpoint is equal to key, mission completed.
    4. Else - there is no key in array.
     */
    public static void binarySearch(int key, int arr[], int min, int max) {
        if (min>max){
            System.out.println("Please, check out your insert. Something wrong with Min and Max");
            return;
        }
        int midPoint = (max+min)/2;

        if (key<arr[midPoint]){
           binarySearch(key, arr, min, midPoint);
        } else if (key>arr[midPoint]){
            binarySearch(key, arr, midPoint, max);
        } else if (key==arr[midPoint]){
            System.out.println("The " + key + " is located with index #" + midPoint);
        } else{
            System.out.println("There is no " + key +" in checked array.");
        }
    }
}
