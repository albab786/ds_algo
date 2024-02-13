package com.practise.prepinsta;

import java.util.Arrays;

public class SortMid {
    public static void swap(int a ,int b){
        int temp=a;
         b=a;
         a=temp;

    }
    static void sortbyMid(int arr[]){
        int i=0;
        int j=arr.length/2;
       while(i<j){
           if(arr[i]>arr[j]){
               swap(arr[i],arr[j]);
               i++;
               j--;
           }if(arr[i]==arr[j]){
               i++;
           }
       }
    }
    public static void main(String[] args) {

        int arr[]={7,8,2,0,6};
        sortbyMid(arr);
        System.out.println(Arrays.toString(arr));
    }
}
