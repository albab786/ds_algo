package com.practise.recursion.array;

public class sortedOrNot {
    public static void main(String[] args) {
        int arr[]={7,8,9,10,11};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int arr[],int index){
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr,index+1);
    }
}
