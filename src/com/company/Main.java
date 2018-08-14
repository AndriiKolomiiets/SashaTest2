package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int sort[] = {687, 12, 6};
        System.out.println(Arrays.toString(sort));
        int minIndex = 0;

        for (int i = 0; i < sort.length-1; i++) {
            for (int j = i; j<sort.length; j++) {
                if (sort[minIndex] > sort[j]) {
                    minIndex = j;
                }
            }
            int temp = sort[i];
            sort[i] = sort[minIndex];
            sort[minIndex] = temp;
        }
        System.out.println(sort[minIndex]);

        System.out.println(Arrays.toString(sort));
    }
}