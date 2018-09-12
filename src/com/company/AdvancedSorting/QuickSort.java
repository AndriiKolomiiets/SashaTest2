package com.company.AdvancedSorting;

import java.util.Arrays;

public class QuickSort {
    public void qSort(int arr[], int start, int end) {
        int pivot = end;
        for (int i = end-1; i > start; i--) {
            System.out.println(Arrays.toString(arr));
            System.out.println(start + "   " + pivot + "    "+ end + "   i=" + i);
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                pivot = i;
            }
        }
        if (start< end) {
            qSort(arr, start, pivot);
            qSort(arr, pivot, end);
        }

    }
}
