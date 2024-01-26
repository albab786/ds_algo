package com.practise.sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 4};
    cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void cyclic(int arr[]) {

        int i = 0;
        while (i < arr.length) {
            int correctpos = arr[i]-1;
            if (arr[i] != correctpos) {
                swap(arr, i, correctpos);
            }
            i++;

        }
    }

    static void swap(int arr[], int posA, int posB) {
        int temp = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = temp;
    }
}
