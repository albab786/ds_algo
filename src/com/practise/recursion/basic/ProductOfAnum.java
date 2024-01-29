package com.practise.recursion.basic;

public class ProductOfAnum {
    public static void main(String[] args) {
        System.out.println(productNum(1230));
    }

    static int productNum(int n){
        if(n%10==n){
            return n;
        }
        return n%10*productNum(n/10);
    }
}
