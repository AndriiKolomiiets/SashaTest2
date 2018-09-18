package com.company.AdvancedSorting;

import java.util.Arrays;

//           Needs to be fixed
public class QuickSort {
    public void qSort(int arr[], int start, int end) {
        int pivot = end;
        int j = 0;
        for (int i = end-1; i > start; i--) {
//            System.out.println(Arrays.toString(arr));
//            System.out.println(start + "   " + pivot + "    "+ end + "   i=" + i);
            if (arr[i] < arr[pivot]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }

            int temp = arr[j];
            arr[j] = arr[pivot];
            arr[pivot] = temp;
            System.out.println(Arrays.toString(arr));
        }
        if (start< end) {
            qSort(arr, start, pivot);
            qSort(arr, pivot, end);
        }

    }
}
