package com.practise.prepinsta;

public class Hcf {
    static int hcf(int a,int b){
        int ans;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        ans=a;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(hcf(25,30));
    }
}
