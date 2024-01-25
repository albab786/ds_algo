package com.practise.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 9, 0, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int arr[]) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) { // !false = true
                break;
            }
        }
    }
}
