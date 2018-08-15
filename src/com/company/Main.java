package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        int testArray[] = {687, 12, 6, 4, 1, 23, 345, 0, 9, 9, 45896};
        System.out.println(Arrays.toString(testArray));

//        bubbleSort(testArray);
        selectSort(testArray);

    }

    //Sort by bubble method
    public static void bubbleSort(int arrayToSort[]) {
        System.out.println("1");
        for (int i = arrayToSort.length - 1; i < 0; i--) {
            System.out.println("2");
            for (int j = 0; j > i; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int tmp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = tmp;
                    System.out.println(arrayToSort[j] + arrayToSort[j + 1]);
                }
            }

            System.out.println(Arrays.toString(arrayToSort));

        }


    }

    public static void selectSort(int arrToSort[]) {

        int minIndex = arrToSort[0];
        for (int j = 0; j < arrToSort.length; j++) {
            for (int i = j; i < arrToSort.length; i++) {

                if (arrToSort[i] < minIndex) {
                    
                    minIndex = arrToSort[i];
                }

            }
            arrToSort[j] = minIndex;

        }
        System.out.println(Arrays.toString(arrToSort));
    }
}