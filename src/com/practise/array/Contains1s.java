package com.practise.array;

import java.util.ArrayList;

public class Contains1s {
    public static void main(String[] args) {
        int arr[]={23,12,44,11,64,17};
        System.out.println(contains1s(arr));
    }
    public static ArrayList contains1s(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int n=arr[i];
            while(n!=0) {
                int m=n%10;
                if (m == 1) {
                    ans.add(arr[i]);
                }
                n=n/10;
            }
        }
        return ans;

    }
}
