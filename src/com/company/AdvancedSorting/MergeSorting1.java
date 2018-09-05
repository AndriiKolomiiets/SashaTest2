package com.company.AdvancedSorting;

import java.util.*;

public class MergeSorting1 {

    public static int[] mergeSort(int arr[], int from, int to) {
        if (to == 0) {
            return new int[]{arr[0]};

        } else if (to == 1) {
            return new int[]{arr[from]};
        } else if (to == 2) {
            if (arr[from] > arr[from + 1]) {
                return new int[]{arr[from + 1], arr[from]};
            } else {
                return new int[]{arr[from], arr[from + 1]};
            }

        } else {
            int left[] = mergeSort(arr, from, to / 2);
            int right[] = mergeSort(arr, from+(to / 2), to-(to/2));
            return merge(right, left);
        }


    }

    public static int[] merge(int arr1[], int arr2[]) {
        int i = 0;
        int arr1Length = arr1.length;
        int j = 0;
        int arr2Length = arr2.length;
        int k = 0;
        int[] arr = new int[arr1Length + arr2Length];

        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] > arr2[j]) {
                arr[k] = arr2[j];
                j++;
                k++;
            } else {
                arr[k] = arr1[i];
                i++;
                k++;
            }
        }

        while (i < arr1Length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }

        while ((j < arr.length)) {
            arr[k] = arr1[j];
            k++;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }
}
