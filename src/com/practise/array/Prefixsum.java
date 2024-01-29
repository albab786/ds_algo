package com.practise.array;

import java.util.Arrays;

public class Prefixsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       prefixSum(arr);
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i] + " ??");
       }
    }
    static void prefixSum(int arr[]){
        for(int i=1;i< arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
}
