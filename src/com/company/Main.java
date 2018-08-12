package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int sort[] = {12, 65, 687, 14, 10, 56, 18, 954, 1478, 1, 9, 6};

        for (int i = sort.length-1; i>=0; i--) {
            for (int j = 0; j < i; j++)
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
        }
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + ", ");
        }
//        System.out.println(Array%.toString);
    }
}