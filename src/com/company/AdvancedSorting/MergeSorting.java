package com.company.AdvancedSorting;

import java.util.Arrays;

public class MergeSorting {

    public void mSort(int arr[], int from, int length) {

        if (from < length) {
            int m = (from + length) / 2;
            mSort(arr, from, m);
            mSort(arr, m + 1, length);
            merge(arr, from, m, length);
        }
    }


    private void merge(int arr[], int from, int m, int length) {

        int leftPartLength = m - from + 1;
        int rightPartLength = length - m;
        int leftTempArr[] = new int[leftPartLength];
        int rightTempArr[] = new int[rightPartLength];

        for (int i=0; i<leftPartLength; ++i){
            leftTempArr[i] = arr[from+i];
        }

//        if (from == m){
//            m = 1;
//        }
        for (int j =0; j<rightPartLength; ++j){
            rightTempArr[j] = arr[m+j+1];
        }
//        System.out.println(Arrays.toString(leftTempArr));
//        System.out.println(Arrays.toString(rightTempArr));

//        int [] tempArr = new int[leftPartLength+rightPartLength];
        int rightTempIndex = 0, leftTempIndex = 0;
        int tempArrIndex = from;

        while (rightTempIndex<rightPartLength && leftTempIndex<leftPartLength) {

            if (rightTempArr[rightTempIndex] <= leftTempArr[leftTempIndex]) {
                arr[tempArrIndex] = rightTempArr[rightTempIndex];
                rightTempIndex++;
                tempArrIndex++;
            } else if (rightTempArr[rightTempIndex] > leftTempArr[leftTempIndex]) {
                arr[tempArrIndex] = leftTempArr[leftTempIndex];
                leftTempIndex++;
                tempArrIndex++;
            }
        }
        while (rightTempIndex<rightPartLength){
            arr[tempArrIndex] = rightTempArr[rightTempIndex];
            tempArrIndex++;
            rightTempIndex++;
        }
        while (leftTempIndex<leftPartLength){
            arr[tempArrIndex] = leftTempArr[leftTempIndex];
            tempArrIndex++;
            leftTempIndex++;
        }


    }
}
