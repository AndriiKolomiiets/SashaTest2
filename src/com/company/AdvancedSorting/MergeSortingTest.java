package com.company.AdvancedSorting;

import java.util.*;

class MergeSortingTest {
    MergeSorting mSort = new MergeSorting();

    public void testMergeSort() {
        System.out.println("Merge sort test");
        int testArr[] = {687, 12, 6, 4, 1, 23, 345, 0, 9, 9, 45896, 23, 2, -1, 777};
        int testArr1[] = {0};
        int testArr0[] = {};
        int testArr2[] = {0,0,0,0,0,-128};
        System.out.println("Array for Test before sorting: /n1. General array: "  + Arrays.toString(testArr) + "/n2. No data array: " +
                Arrays.toString(testArr0) + "/n3. Zero array: " + Arrays.toString(testArr1) + "/n4. Several zeros array: " + Arrays.toString(testArr2));
        int[] etalonForTest = testArr.clone();
        Arrays.sort(etalonForTest);
        System.out.println("Sorted etalon array: " + Arrays.toString(etalonForTest));
        mSort.mSort(testArr, 0, testArr.length);
        System.out.println("Sorted test arrays: /n1. General array: "  + Arrays.toString(testArr) + "/n2. No data array: " +
                Arrays.toString(testArr0) + "/n3. Zero array: " + Arrays.toString(testArr1) + "/n4. Several zeros array: " + Arrays.toString(testArr2));

    }

}