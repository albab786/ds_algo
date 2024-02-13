package com.practise.prepinsta;

public class Second_Smallest {
    static int secondSmall(int arr[]){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
        int secondsmall=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<secondsmall && arr[i]>smallest){
                secondsmall=arr[i];
            }
        }
        return secondsmall;
    }
    public static void main(String[] args) {

        int arr[]={7,8,2,5,4,6};
        System.out.println(secondSmall(arr));
    }
}
