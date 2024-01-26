package com.practise.recursion;

public class BinarySerach {
    public static void main(String[] args) {
      int arr[]={1,7,8,9,22,44,75,99,110,999};


      System.out.println( binarySearch(arr,99,0, arr.length-1));
    }

    public static int binarySearch(int[] arr, int target,int s,int e) {

        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(arr,target,s,mid-1);
        }
        return binarySearch(arr,target,mid+1,e);

    }
}
