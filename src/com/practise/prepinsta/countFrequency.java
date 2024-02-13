package com.practise.prepinsta;

public class countFrequency {
    public static void frequency(int arr[]){
        for(int i=0;i< arr.length;i++){
            int count=0;
            int x=arr[i];
            if(x==-1){
                continue;
            }
            for(int j=0;j< arr.length;j++){
                if(arr[j]==x){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println("frequency of"+ " "+x+ " "+ count);
        }
    }
    public static void main(String[] args) {
       int arr[]={5, 8, 5, 7, 8, 10,7,7,8};
       frequency(arr);
    }
}
