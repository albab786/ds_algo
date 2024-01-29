package com.practise.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDublicate {
    public static void main(String[] args) {
int nums[]={0,1,2,2,3,0,4,2};
      //  removeDuplicates(nums);
        removeElement(nums, 2);
    }
    public static void removeDuplicates(int[] nums){
        int [] arr=new int[nums.length];
        int m=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                arr[m]=nums[i];
                m++;

            }

        }
        if(nums[nums.length-1]!=nums.length-2){
            arr[m]=nums[nums.length-1];
           m++;
        }
        System.out.println(m);
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]!=arr[j+1]){
                System.out.print(arr[j] + " ");

            }
        }
    }
    public static void removeElement(int[] nums, int val) {
        int [] arr=new int [nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                arr[count]=nums[i];
                count++;


            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));

    }
}
