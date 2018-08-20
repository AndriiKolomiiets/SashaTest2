package com.company;

import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testInsertSort() {
        System.out.println("Insert sort test");
        int testArr[] = {687, 12, 6, 4, 1, 23, 345, 0, 9, 9, 45896, 23, 2, -1, 777};
        System.out.println("Array for Test before sorting: " + Arrays.toString(testArr));
        int etalonForTest[] = testArr.clone();
        System.out.println("Etalon array before sorting: " + Arrays.toString(etalonForTest));
        System.out.print("Sorted Test array: ");

        Main.insertSort(testArr);

        Arrays.sort(etalonForTest);
        System.out.println("Sorted Etalon array: " + Arrays.toString(etalonForTest));
        Assert.assertArrayEquals(testArr, etalonForTest);
        System.out.println(" ");
    }

    @org.junit.jupiter.api.Test
    void testBubbleSort() {
        System.out.println("Bubble sort test");
        int testArr[] = {687, 12, 6, 4, 1, 23, 345, 0, 9, 9, 45896, 23, 2, -1, 777};
        System.out.println("Array for Test before sorting: " + Arrays.toString(testArr));
        int etalonForTest[] = testArr.clone();
        System.out.println("Etalon Array before sorting: " + Arrays.toString(etalonForTest));
        Arrays.sort(etalonForTest);
        System.out.println("Sorted Etalon Array: " + Arrays.toString(etalonForTest));
        System.out.print("Test result: ");
        Main.bubbleSort(testArr);

        Assert.assertArrayEquals(testArr, etalonForTest);
        System.out.println(" ");
    }

    @org.junit.jupiter.api.Test
    void testSelectSort() {
        System.out.println("Select sort test");
        int testArr[] = {687, 12, 6, 4, 1, 23, 345, 0, 9, 9, 45896, 23, 2, -1, 777};
        System.out.println("Array for Test before sorting: " + Arrays.toString(testArr));
        int etalonForTest[] = testArr.clone();
        System.out.println("Etalon array before sorting: " + Arrays.toString(etalonForTest));
        System.out.print("Test result: ");
        Main.selectSort(testArr);
        Arrays.sort(etalonForTest);
        System.out.println("Sorted Etalon Array: " + Arrays.toString(etalonForTest));

        Assert.assertArrayEquals(testArr, etalonForTest);
        System.out.println(" ");
    }

}