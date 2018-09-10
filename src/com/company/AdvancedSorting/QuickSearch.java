package com.company.AdvancedSorting;

public class QuickSearch {
    public void qSort(int arr[], int start, int end) {
        int pivot = start;
        for (int i = start; i < end+1; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                pivot = i;
            }
        }
        if (start != pivot || end != pivot) {
            qSort(arr, start, pivot);
            qSort(arr, pivot, end);
        }

    }
}
