package com.lee;

import java.util.Arrays;

public class Main {

    // 比较SelectionSort和InsertionSort两种排序算法的性能效率
    // 优化后，插入排序比选择排序性能略好
    // 对于有序性强的数组，插入排序远远优于选择排序
    public static void main(String[] args) {

        int N = 50000;

        // 测试1 一般测试
        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");

        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr4 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.lee.SelectionSort", arr1);
        SortTestHelper.testSort("com.lee.InsertionSort", arr2);
        SortTestHelper.testSort("com.lee.BubbleSort", arr3);
        SortTestHelper.testSort("com.lee.MergeSort", arr4);

        System.out.println();


        // 测试2 有序性更强的测试
        System.out.println("Test for more ordered random array, size = " + N + " , random range [0,3]");

        arr1 = SortTestHelper.generateRandomArray(N, 0, 3);
        arr2 = Arrays.copyOf(arr1, arr1.length);
        arr3 = Arrays.copyOf(arr1, arr1.length);
        arr4 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.lee.SelectionSort", arr1);
        SortTestHelper.testSort("com.lee.InsertionSort", arr2);
        SortTestHelper.testSort("com.lee.BubbleSort", arr3);
        SortTestHelper.testSort("com.lee.MergeSort", arr4);
        System.out.println();


        // 测试3 测试近乎有序的数组
        int swapTimes = 100;
        System.out.println("Test for nearly ordered array, size = " + N + " , swap time = " + swapTimes);

        arr1 = SortTestHelper.generateNearlyOrderedArray(N, swapTimes);
        arr2 = Arrays.copyOf(arr1, arr1.length);
        arr3 = Arrays.copyOf(arr1, arr1.length);
        arr4 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.lee.SelectionSort", arr1);
        SortTestHelper.testSort("com.lee.InsertionSort", arr2);
        SortTestHelper.testSort("com.lee.BubbleSort", arr3);
        SortTestHelper.testSort("com.lee.MergeSort", arr4);
        return;
    }
}
