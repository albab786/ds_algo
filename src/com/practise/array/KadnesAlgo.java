package com.practise.array;

public class KadnesAlgo {
    public static int maxsubArray(int arr[]) {
        int currSum = 0;
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxsum) {
                maxsum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxsum;
    }

    public static int subarraySum(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int currSum = 0;
            currSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int maxProduct(int[] arr) {
        int currentsum=Integer.MIN_VALUE;
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++) {
            currentsum *= arr[i];

            if (currentsum > maxsum) {
                maxsum = currentsum;
            }
            if (currentsum < 0) {
                currentsum = 1;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(maxProduct(arr));

    }
}
