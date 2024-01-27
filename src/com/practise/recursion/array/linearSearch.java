package com.practise.recursion.array;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {7, 9, 11, 55, 66, 78, 99};

        System.out.println(isPresent(arr, 9, 0));
        System.out.println(findIndex(arr,55,0));
    }


    public static boolean isPresent(int arr[], int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || isPresent(arr, target, index + 1);
    }

    static int findIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);

    }
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }
}
