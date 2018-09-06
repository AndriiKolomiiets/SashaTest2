package com.company.AdvancedSorting;

import java.util.Arrays;

public class BinarySearch {

    public void mSort(int arr[], int from, int length) {

        if (from < length) {
            int m = (from + length) / 2;
            System.out.println("1from=" + from + " 1length=" + length + " 1m=" + m);
            mSort(arr, from, m);
            mSort(arr, m + 1, length);
            System.out.println("from=" + from + " length=" + length + " m=" + m);
        }

    }
}
